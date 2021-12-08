package com.example.eurder.service.mappers;

import com.example.eurder.domain.user.User;
import com.example.eurder.service.dtos.CreateUserDto;
import com.example.eurder.service.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapCreateUserDtoToUser(CreateUserDto createUserDto) {
        return User.UserBuilder.userBuilder()
                .withFirstname(createUserDto.getFirstname())
                .withLastname(createUserDto.getLastname())
                .withEmailAddress(createUserDto.getEmailAddress())
                .withAddress(createUserDto.getAddress())
                .withPhoneNumber(createUserDto.getPhoneNumber())
                .build();
    }

    public UserDto mapUserToUserDto(User user) {
        return new UserDto()
                .setId(user.getId())
                .setFirstname(user.getFirstname())
                .setLastname(user.getLastname())
                .setEmailAddress(user.getEmailAddress())
                .setAddress(user.getAddress())
                .setPhoneNumber(user.getPhoneNumber());
    }
}
