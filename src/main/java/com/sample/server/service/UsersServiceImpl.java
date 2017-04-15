package com.sample.server.service;

import com.sample.server.entity.Users;
import com.sample.server.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    public Users getByID(long id) {
        return usersRepository.findOne(id);
    }

    public Users save(Users user) {
        return usersRepository.saveAndFlush(user);
    }

    public void remove(long id) {
        usersRepository.delete(id);
    }
}
