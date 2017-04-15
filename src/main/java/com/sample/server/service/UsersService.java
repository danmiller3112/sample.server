package com.sample.server.service;

import com.sample.server.entity.Users;

import java.util.List;

public interface UsersService {

    List<Users> getAll();

    Users getByID(long id);

    Users save(Users user);

    void remove(long id);
}
