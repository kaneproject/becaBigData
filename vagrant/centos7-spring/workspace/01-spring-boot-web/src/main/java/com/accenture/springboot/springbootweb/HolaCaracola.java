package com.accenture.springboot.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaCaracola {

	@RequestMapping("/")
	@ResponseBody
	public String saludar(){
		return "<marquee>Hola</marquee>";
	}
	@RequestMapping("/all")
	@ResponseBody
	public String saludarATodos(){
		return "<marquee>Hola a todos</marquee>";
	}
	@RequestMapping("/me")
	@ResponseBody
	public String saludarmeAMiMismo(){
		return "<marquee>Hola a mi mismo</marquee>";
	}
	
}
