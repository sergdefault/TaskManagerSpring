package com.tsymbaliuk.taskManagerApp.dao;

import com.tsymbaliuk.taskManagerApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tsymbaliuk Serhii on 20.12.2016.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername (String username);
}

