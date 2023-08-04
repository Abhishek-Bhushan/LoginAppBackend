package com.assignment.login.service;

import com.assignment.login.model.User;

public interface UserServiceInterface 
{ 
    public abstract String checkLogin(User user);
    public abstract boolean saveUser(User user);
}
