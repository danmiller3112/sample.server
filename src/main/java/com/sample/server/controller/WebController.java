package com.sample.server.controller;

import com.sample.server.entity.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/server")
public class WebController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public Users getHello() {
        return createUser();
    }

    private Users createUser() {
        Users user = new Users();
        user.setId(1);
        user.setDate(new Date());
        user.setLogin("User1");
        user.setPassword("12345");
        return user;
    }
}
