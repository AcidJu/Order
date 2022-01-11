package com.example.eurder.service;

import com.example.eurder.domain.user.User;
import com.example.eurder.repository.UserRepository;
import com.example.eurder.service.dtos.CreateUserDto;
import com.example.eurder.service.dtos.UserDto;
import com.example.eurder.service.mappers.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public List<UserDto> getAllUser() {
        return userRepository.getAllUser().stream().map(user -> userMapper.mapUserToUserDto(user)).collect(Collectors.toList());
    }

    public UserDto getCustomerById(UUID id) {
        User user = userRepository.getUserById(id);
        return userMapper.mapUserToUserDto(user);
    }
}
