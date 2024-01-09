package com.example.demo_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/converter")
public class ConverterController {

    @GetMapping("home")
    public String showform() {
        return "index";
    }

    @PostMapping("/home")
    public ModelAndView converter(@RequestParam("vnd") String vnd) {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println(vnd);
        Integer usd = Integer.parseInt(vnd) * 23;
        modelAndView.addObject("usd", usd);
        return modelAndView;
    }
}
