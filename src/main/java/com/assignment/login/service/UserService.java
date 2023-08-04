package com.assignment.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.login.dao.UserDAO;
import com.assignment.login.model.User;

@Service
public class UserService implements UserServiceInterface
{
    @Autowired
    UserDAO userDAO;

    public String checkLogin(User user)
    {
        String status="";
        String password = user.getPassword();
        User userInfo = userDAO.checkLogin(user);
        if(userInfo == null ){
            status = "Invalid Email";
        } else if (userInfo.getPassword().equals(password)){
            status = "Login Successfully";
        }
        else{
            status = "Invalid Password";
        }
        return status;

    }

    public boolean saveUser(User user){
        return userDAO.saveUser(user);
    }

    public String getName( String email){
        return userDAO.getName(email) ;
    }
    
}
