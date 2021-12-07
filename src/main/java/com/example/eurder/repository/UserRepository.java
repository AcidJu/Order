package com.example.eurder.repository;

import com.example.eurder.domain.user.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class UserRepository {

    private final Map<UUID, User> users = new HashMap<>();

    public UserRepository() {

    }
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getAllUser() {
        return users.values().stream().collect(Collectors.toList());

    }
}
