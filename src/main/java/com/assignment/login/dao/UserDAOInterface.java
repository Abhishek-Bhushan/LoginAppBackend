package com.assignment.login.dao;

import com.assignment.login.model.User;

public interface UserDAOInterface {
    
    public abstract User checkLogin(User user);
    public abstract String getName( String email);
}
