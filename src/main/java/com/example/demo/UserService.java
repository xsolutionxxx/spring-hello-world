package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    // Додавання користувачів
    public UserService() {
        users.add(new User(1L, "Іван Іванов", "ivan@example.com"));
        users.add(new User(2L, "Марія Петрівна", "maria@example.com"));
        users.add(new User(3L, "Олексій Олексійович", "olexiy@example.com"));
    }

    // Отримати список користувачів
    public List<User> getAllUsers() {
        return users;
    }
}
