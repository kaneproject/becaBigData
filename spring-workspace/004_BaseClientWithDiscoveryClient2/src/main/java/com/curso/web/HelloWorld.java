package com.curso.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorld {

	@Value("${message:Hello default}")
    private String message;
    @RequestMapping("/")
    public String home() {
    	System.out.println("Responde v2");
      return message;
    }
	
}
