package com.panda.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class TestControner {
//	@RequestMapping("index")
	public String index(Model model){
		model.addAttribute("msg", "hello World");
		return "test";
	}
}
