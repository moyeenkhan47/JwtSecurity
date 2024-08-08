package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.Models.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/test")
    public List<User> test() {
        this.logger.warn("This is working message");
        return this.userService.getUser();
    }
    @GetMapping("/current_user")
public String getLoggedInUser(Principal principal)
{
    	return principal.getName();
}
}
