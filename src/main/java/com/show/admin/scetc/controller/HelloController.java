package com.show.admin.scetc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Ray
 *
 */
@RestController
@RequestMapping("")
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello springboot~!";
	}
	@RequestMapping("welcome")
	public String welcome()
	{
		return "welcome to my wolrd";
	}
	
	
	
	
}