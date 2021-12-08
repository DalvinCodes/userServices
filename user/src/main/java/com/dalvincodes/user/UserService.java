package com.dalvincodes.user;

import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository userRepository) {
    public void registerUser(UserRegistrationRequest request) {
        User user = User.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //TODO: check if email is valid
        //TODO: check if email is not taken
        //TODO: store user in db
        userRepository.save(user);
    }
}
