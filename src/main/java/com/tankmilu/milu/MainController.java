package com.tankmilu.milu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/")
    public String root() {
        return "redirect:/index";
    }
    
}