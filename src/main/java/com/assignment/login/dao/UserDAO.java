package com.assignment.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assignment.login.model.User;
import com.assignment.login.repository.UserRepository;

@Component
public class UserDAO implements UserDAOInterface{

    @Autowired
    UserRepository userRepository;
    
    public User checkLogin(User user)
    {
        String email = user.getEmail();
        return userRepository.findByEmail(email);    
    } 

    public boolean saveUser(User user)
    {
        User userInfo = userRepository.save(user);
        if(userInfo != null)
        {
            return true;
        }
        return false;
    }
}