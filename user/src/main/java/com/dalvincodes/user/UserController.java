package com.dalvincodes.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/user")
public record UserController(UserService userService) {

    @PostMapping
    public void registerUser(@RequestBody UserRegistrationRequest userRegistrationRequest){
        log.info("new user registered {}", userRegistrationRequest);
        userService.registerUser(userRegistrationRequest);
    }

}
