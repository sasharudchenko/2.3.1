package ru.rudchenko.crudapp.DAO;

import ru.rudchenko.crudapp.model.User;

import java.util.List;
import java.util.Locale;

public interface UserDAO {
    void add(User user);
    List<User> allUser(String name, String surname, Integer age, String city);
    User userById(long id);
    void update(long id, User user);
    void delete(long id);



}
