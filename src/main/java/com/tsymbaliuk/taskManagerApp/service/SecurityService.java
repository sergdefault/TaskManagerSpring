package com.tsymbaliuk.taskManagerApp.service;

/**
 * Created by Tsymbaliuk Serhii on 20.12.2016.
 */
public interface SecurityService {
    String findloggedInUsername();
    void autoLogin(String username, String password);
}
