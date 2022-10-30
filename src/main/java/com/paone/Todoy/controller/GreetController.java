package com.paone.Todoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {
	
	@RequestMapping("/")
		public String empty()
    {
		return index();
    }
	@RequestMapping(value = "/index.html")
	   public String index() {
	      return "index";
	   }

}
