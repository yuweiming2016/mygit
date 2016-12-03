package com.brian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**v2*/
@Controller
@SpringBootApplication
public class SampleController  {
 
	@Value("${mysqldb.datasource.url:World!}")
	private String name;
	
	
    @ResponseBody
    @RequestMapping(value = "/")
    String home() { 

        return "Hello World!" + name;
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
 
}