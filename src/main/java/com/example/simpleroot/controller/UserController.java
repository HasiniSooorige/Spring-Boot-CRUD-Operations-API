package com.example.simpleroot.controller;

import com.example.simpleroot.dto.UserDTO;
import com.example.simpleroot.repository.UserRepo;
import com.example.simpleroot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
        private UserService userService;

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
         return userService.saveUser(userDTO);
    }

    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return  userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userId}")
    public UserDTO getUserByUserId(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }

    @GetMapping("/getUserByUserIdAndAddress/{userId}/{userAddress}")
    public UserDTO getUserByUserIdAndAddress(@PathVariable String userId, @PathVariable String userAddress){
        return  userService.getUserByUserIdAndAddress(userId,userAddress);
    }

}
