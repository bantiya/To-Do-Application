package com.bhavya.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String logInJsp(@RequestParam String name, ModelMap model) {

        model.put("name", name);

        // Logging the name of the person or the Request param that we get:
        logger.debug("Request param is :{}",name);
        System.out.println("Request param is " + name);
        return "login";
    }
}
