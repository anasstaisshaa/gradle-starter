package edu.AnastasiiaTkachuk.dao;

import edu.AnastasiiaTkachuk.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll(){
        return List.of(
                new User(12, "Ivan"),
                new User(15, "Petr"),
                new User(33, "Sveta")
        );
    }
}
