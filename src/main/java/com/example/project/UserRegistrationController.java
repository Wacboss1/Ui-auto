package com.example.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", consumes = "application/json", produces = "application/json")
public class UserRegistrationController {

    @GetMapping("/")
    public String serveHTML() {
        return "index";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createUser(@RequestBody UserRegistration userRequest) {
        // Implement user creation logic here
        return ResponseEntity.status(HttpStatus.CREATED)
        .body("{\"firstName\":\"John\",\"lastName\":\"Doe\",\"id\":1}");
    }

    @GetMapping("/{user-id}")
    @ResponseStatus
    @ResponseBody
    public ResponseEntity<UserRegistration> getUserById(@PathVariable("user-id") String userId) {
        UserRegistration user = new UserRegistration("Jürgen", "Müller");
        return ResponseEntity.ok().body(user);
    }
    //create 
}