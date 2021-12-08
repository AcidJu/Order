package com.example.eurder.service;

import com.example.eurder.domain.user.Feature;
import com.example.eurder.domain.user.User;
import com.example.eurder.exceptions.UserDoesNotExistException;
import com.example.eurder.exceptions.UserInputIsNotValidException;
import com.example.eurder.exceptions.UserNotAuthorizedException;
import com.example.eurder.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.UUID;


@Service
public class SecurityService {

    private final UserRepository userRepository;

    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void validateAccess(String authorization, Feature feature) {
        String decodingPassword = new String(Base64.getDecoder().decode(authorization.substring("Basic ".length())));
        String email = decodingPassword.substring(0, decodingPassword.indexOf(":"));
        String password = decodingPassword.substring(decodingPassword.indexOf(":") + 1);
        User user = userRepository.getUserByEmail(email);
        if(user == null){
            throw new UserDoesNotExistException();
        }
        if(!user.getPassword().equals(password)){
            throw new UserInputIsNotValidException("Sorry, wrong password!");
        }
        if(!user.hasAccessTo(feature)){
            throw new UserNotAuthorizedException("");
        }
    }

    public User getCurrentUser(String authorization) {
        String decodeUsernamePassword = new String(Base64.getDecoder().decode(authorization.substring("Basic ".length())));
        String email = decodeUsernamePassword.substring(0, decodeUsernamePassword.indexOf(":"));
        User user = userRepository.getUserByEmail(email);
        return user;
    }

    public void isCorrectUser(UUID currentUserId, UUID candidateId) {
        if (!currentUserId.equals(candidateId)) {
            throw new UserNotAuthorizedException("Incorrect User");
        }
    }
}
