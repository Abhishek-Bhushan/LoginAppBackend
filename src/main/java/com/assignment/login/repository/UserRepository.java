package com.assignment.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.login.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    public abstract User findByEmail(String email);

}
