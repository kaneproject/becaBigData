package com.curso.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class Configuracion {
	@Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor("user", "mipass");
    }
}

@FeignClient(name="baseclientwithdiscovery",  configuration = Configuracion.class)
interface HolaMundoCliente {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String holaMundo();
}

@RestController
class HolaMundoClienteController {

	@Autowired
    private HolaMundoCliente holaMundoCliente;
	
	@RequestMapping("/")
	@HystrixCommand(fallbackMethod="fallbackHome")
	public String home() {
		return holaMundoCliente.holaMundo() + " con Feign y circuit-breaker";

	}
	public String fallbackHome(Throwable t) {
		t.printStackTrace();
        return "Hubo un problema con un servicio: " + t.getMessage();
    }
}