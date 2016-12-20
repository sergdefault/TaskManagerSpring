package com.tsymbaliuk.taskManagerApp.service;

import com.tsymbaliuk.taskManagerApp.model.User;

/**
 * Created by Tsymbaliuk Serhii on 20.12.2016.
 */
public interface UserService {
    void save(User user);
    User findByUsername (String username);
}
