package com.messenger.miracle.com.service.jpa;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.messenger.miracle.com.model.User;
import com.messenger.miracle.com.repository.UserRepository;
import com.messenger.miracle.com.service.UserService;
 
 
 
@Service
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return userRepository.findOne(id);
    }
 
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
 
    public User saveUser(User user) {
        return userRepository.save(user);
    }
 
    public User updateUser(User user){
        return saveUser(user);
    }
 
    public void deleteUserById(Integer id){
        userRepository.delete(id);
    }
 
    public void deleteAllUsers(){
        userRepository.deleteAll();
    }
 
    public List<User> findAllUsers(){
        return (List<User>) userRepository.findAll();
    }
 
    public boolean isUserExist(User user) {
        return findByName(user.getEmailId()) != null;
    }
 
 
}