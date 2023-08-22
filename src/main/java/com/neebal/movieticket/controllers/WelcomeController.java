package com.neebal.movieticket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {


    @GetMapping("/")
    public String showWelcomePage() {
        return "welcome";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Implement your user login page
    }

    @GetMapping("/add-movie")
    public String showAddMoviePage() {
        return "add-movie";
    }

    @GetMapping("/add-theatre")
    public String showAddTheatrePage() {
        return "add-theatre";
    }
}
