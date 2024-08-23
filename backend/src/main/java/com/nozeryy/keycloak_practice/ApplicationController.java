package com.nozeryy.keycloak_practice;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
@CrossOrigin("http://localhost:4200")
public class ApplicationController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String greet(){
        return "USER Endpoint";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String adminEndpoint(){
        return "ADMIN Endpoint";
    }
}
