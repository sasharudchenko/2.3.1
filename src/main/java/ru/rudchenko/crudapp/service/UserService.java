package ru.rudchenko.crudapp.service;

import ru.rudchenko.crudapp.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> allUser(String name, String surname, Integer age, String city);
    User userById(long id);
    void update(long id, User user);
    void delete(long id);
}
