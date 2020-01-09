package com.offcn.controller;


import com.offcn.entity.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/")
     public  String addUser(@RequestBody User user){
         userService.addUser(user);
         return "add-success";

     }


     @PutMapping("/{id}")
     public String updateUser(@RequestBody User user,@PathVariable("id") Long id){
            user.setId(id);
         userService.updateUser(user);
         return "update-success";
     }

    @DeleteMapping("/{id}")
    public String delUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "del-success";
    }


    @GetMapping("/{id}")
    public  User findOneUser(@PathVariable("id") Long id){
        return userService.getOneUser(id);
    }

    @GetMapping("/")
    public List<User> findAllUser(){
        return userService.getAllUser();
    }


    /**
     * 新增方法
     * @param id
     */
    public void save(Long id){

           System.out.println("打个电话");

    }
}
