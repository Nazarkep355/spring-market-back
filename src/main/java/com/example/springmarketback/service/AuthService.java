package com.example.springmarketback.service;

import com.example.springmarketback.entity.userentity.Role;
import com.example.springmarketback.entity.userentity.User;
import com.example.springmarketback.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtService jwtService;

    private final UserRepository userRepository;


    private boolean isUserExists(User user){
        return userRepository.findUserByEmail(user.getEmail()).isPresent();
    }
    public String register(User user){
        if(isUserExists(user)){
            throw new IllegalArgumentException("Email already used");
        }
        String token = jwtService.generateToken(user);
        user.setRole(Role.USER);
        userRepository.save(user);
        return token;
    }


}
