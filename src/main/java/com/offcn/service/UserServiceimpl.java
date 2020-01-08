package com.offcn.service;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao  userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);


    }

    @Override
    public void updateUser(User user) {
        userDao.saveAndFlush(user);

    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);

    }

    @Override
    public User getOneUser(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {

        return userDao.findAll();
    }
}
