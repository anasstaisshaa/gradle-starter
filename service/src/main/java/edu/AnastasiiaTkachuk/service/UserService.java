package edu.AnastasiiaTkachuk.service;

import edu.AnastasiiaTkachuk.dao.UserDao;
import edu.AnastasiiaTkachuk.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll(){
        return userDao.findAll();
    }
}
