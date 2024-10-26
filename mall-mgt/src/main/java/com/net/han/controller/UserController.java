package com.net.han.controller;

import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.user.UserConditionEntity;
import com.net.han.entity.user.UserEntity;
import com.net.han.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @ClassName UserController @Description TODO
 *
 * @author han @Date 2024/10/26 17:24 @Version 1.0
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findById")
    public UserEntity findById(Long id) {
        return userService.findById(id);
    }

    @PostMapping("/searchByPage")
    public ResponsePageEntity<UserEntity> searchByPage(@RequestBody UserConditionEntity userConditionEntity) {
        return userService.searchByPage(userConditionEntity);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody UserEntity userEntity) {
        return userService.insert(userEntity);
    }

    @PostMapping("/update")
    public int update(@RequestBody UserEntity userEntity) {
        return userService.update(userEntity);
    }

    @GetMapping("/deleteById")
    public int deleteById(@NotNull Long id) {
        return userService.deleteById(id);
    }
}
