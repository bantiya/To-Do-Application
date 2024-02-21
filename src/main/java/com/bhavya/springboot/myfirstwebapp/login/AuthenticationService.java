package com.bhavya.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String userName, String password) {
        boolean isValidUserName = userName.equalsIgnoreCase("name");
        boolean isValidPassword = password.equalsIgnoreCase("temp");

        return isValidUserName && isValidPassword;
    }
}
