package com.net.han.controller.user;

import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.user.UserConditionEntity;
import com.net.han.entity.user.UserEntity;
import com.net.han.service.user.UserDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @ClassName UserController @Description  
 *
 * @author han @Date 2024/10/26 17:24 @Version 1.0
 */

@Api(tags = "用户操作", value = "用户接口")
@RestController
@RequestMapping("/user")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

    @ApiOperation(notes = "根据ID查询用户信息", value = "通过id查询用户信息")
    @GetMapping("/findById")
    public UserEntity findById(Long id) {
        return userDemoService.findById(id);
    }

    @ApiOperation(notes = "分页查询用户信息", value = "分页查询用户信息")
    @PostMapping("/searchByPage")
    public ResponsePageEntity<UserEntity> searchByPage(@RequestBody UserConditionEntity userConditionEntity) {
        return userDemoService.searchByPage(userConditionEntity);
    }

    @ApiOperation(notes = "新增用户信息", value = "新增用户信息")
    @PostMapping("/insert")
    public int insert(@RequestBody UserEntity userEntity) {
        return userDemoService.insert(userEntity);
    }

    @ApiOperation(notes = "修改用户信息", value = "修改用户信息")
    @PostMapping("/update")
    public int update(@RequestBody UserEntity userEntity) {
        return userDemoService.update(userEntity);
    }

    @ApiOperation(notes = "删除用户信息", value = "删除用户信息")
    @GetMapping("/deleteById")
    public int deleteById(@NotNull Long id) {
        return userDemoService.deleteById(id);
    }
}
