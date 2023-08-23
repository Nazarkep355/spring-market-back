package com.example.springmarketback.controller;

import com.example.springmarketback.entity.userentity.User;
import com.example.springmarketback.service.AuthService;
import com.example.springmarketback.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    final private AuthService authService;
    @PostMapping(value = "/register",consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity register(@RequestBody User user){
            return ResponseEntity.ok(authService.register(user));
        }
}
