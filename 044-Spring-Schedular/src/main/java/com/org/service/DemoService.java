package com.org.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

//	corn : https://www.freeformatter.com/cron-expression-generator-quartz.html
	
	@Scheduled(cron = "0 0 0 * * ?")
	public void schedule() {
		System.out.println("Mail sending....!");
	}
	
	/*
	@Scheduled(fixedRate = 3000)
	public void m1() {
		
		//logic
		
		System.out.println("report sending..!");
	}
	*/
}
