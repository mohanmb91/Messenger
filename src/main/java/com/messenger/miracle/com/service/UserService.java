package com.messenger.miracle.com.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.messenger.miracle.com.model.User;

@Service
public interface UserService {
     
    User findById(Integer id);
 
    User findByName(String name);
 
    User saveUser(User user);
 
    User updateUser(User user);
 
    void deleteUserById(Integer id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);
}