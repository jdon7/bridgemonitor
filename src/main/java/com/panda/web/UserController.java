package com.panda.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
 
    @RequestMapping("index")
    public String index(Model model){
    	model.addAttribute("name", "jdon");
        return "index";
    }
     
}
