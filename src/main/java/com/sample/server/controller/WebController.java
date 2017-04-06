package com.sample.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String getHello(ModelMap map) {
        return "Hello Dan";
    }
}
