package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
@RequestMapping("/hello")
public String hello(){
	return "index.jsp";
}
@RequestMapping("/bolo")
public String helloworld(){
	return "two.jsp";
}
}
