package com.example.ConfigurationManagement;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ConfigCheck")
public class ResourceConfiguration {
	
	@Value("${server.port}")
	 String propValue;
	
	@Value("${my.greeting}")
	String msgValue;
	
	@Value("${my.environment}")
	String env;
	
	@RequestMapping("/AccessProperty")
	String getPropertyData(){
		return propValue;
		
	}
	
	@RequestMapping("/msgData")
	String getMsgData(){
		return msgValue;		
	}	
	
	@RequestMapping("/envData")
	String getEnvData(){
		return env;		
	}	
}
