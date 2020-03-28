package com.codesingh.springsecurityjwt.models;

public class AuthenticationResponse {

    public String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
