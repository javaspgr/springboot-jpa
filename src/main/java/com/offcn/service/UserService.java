package com.offcn.service;

import com.offcn.entity.User;

import java.util.List;

public interface UserService {

        public  void  addUser(User user);

         public  void  updateUser(User user);

        public  void  deleteUser(Long id);

        public User  getOneUser(Long id);

        public List<User> getAllUser();


}
