package com.elespada.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hours {
	
	@RequestMapping("/hours")
	public String getHours() {
		
			return "hours";
		}
	}