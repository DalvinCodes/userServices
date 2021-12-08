package com.dalvincodes.user;

public record UserRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
