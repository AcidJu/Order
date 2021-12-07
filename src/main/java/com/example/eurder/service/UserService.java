package com.example.eurder.service;

import com.example.eurder.domain.user.User;
import com.example.eurder.repository.UserRepository;
import com.example.eurder.service.dtos.CreateUserDto;
import com.example.eurder.service.dtos.UserDto;
import com.example.eurder.service.mappers.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDto addNewMember(CreateUserDto newUser) {
        User user = userMapper.mapCreateUserDtoToUser(newUser);
        userRepository.save(user);
        return userMapper.mapUserToUserDto(user);
    }
}
