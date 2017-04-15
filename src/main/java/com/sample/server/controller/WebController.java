package com.sample.server.controller;

import com.sample.server.entity.Users;
import com.sample.server.repository.UsersRepository;
import com.sample.server.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("/server")
public class WebController {

//    @Autowired
//    private UsersRepository usersRepository;

    @Autowired
    private UsersService service;

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getAllUsers() {
        return service.getAll();
    }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Users getUser(@PathVariable long id) {
        return service.getByID(id);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public Users saveUser(@RequestBody Users user) {
        return service.save(user);
    }

    @RequestMapping(value = "/delUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void deleteUser(@PathVariable long id) {
        service.remove(id);
    }

}
