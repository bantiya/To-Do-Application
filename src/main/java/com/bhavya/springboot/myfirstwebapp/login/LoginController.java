package com.bhavya.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    // src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    @RequestMapping("/login")
    public String logInJsp() {
        return "login";
    }
}
