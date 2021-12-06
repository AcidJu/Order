package com.example.eurder.repository;

import com.example.eurder.domain.user.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserRepository {

    private final Map<UUID, User> users = new HashMap<>();

    public UserRepository() {

    }
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }
}
