package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

@RestController
public class HelloWorldController {
	
	@Autowired
	private Environment environment;
	
	@Value("${cn.itcast.name}")
	private String itcastName;
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	@Value("${com.itheima.name}")
	private String heimaName;
	
	@Autowired
	private ItcastProperties itcastProperties;

	@RequestMapping("/hello3")
	public String sayHello() {
		System.out.println("-----------------------");
		System.out.println("cn.itcast.name = " + environment.getProperty("cn.itcast.name"));
		System.out.println("cn.itcast.url = " + environment.getProperty("cn.itcast.url"));
		System.out.println("com.itheima.name = " + environment.getProperty("com.itheima.name"));
		System.out.println("-------------------------------");
		System.out.println("itcastName = " + itcastName);
		System.out.println("itcastUrl = " + itcastUrl);
		System.out.println("heimaName = " + heimaName);
		System.out.println("-------------------------------");
		System.out.println("itcastName = " + itcastProperties.getName());
		System.out.println("itcastUrl = " + itcastProperties.getUrl());
		return "Hello World!";
	}
}
