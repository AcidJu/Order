package com.example.eurder.api;

import com.example.eurder.service.UserService;
import com.example.eurder.service.dtos.CreateUserDto;
import com.example.eurder.service.dtos.UserDto;
import com.example.eurder.service.mappers.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserService userService;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto registerMember(@RequestBody CreateUserDto newMember) {
        logger.debug("Method not working");
        return userService.addNewMember(newMember);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "customers")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUser(@PathVariable("id") UUID id) {
        return userService.getCustomerById(id);
    }
}
