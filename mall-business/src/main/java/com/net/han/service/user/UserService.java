package com.net.han.service.user;

import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.user.UserConditionEntity;
import com.net.han.entity.user.UserEntity;
import com.net.han.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService @Description  
 *
 * @author han @Date 2024/10/26 17:56 @Version 1.0
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserEntity findById(Long id) {
        return userMapper.findById(id);
    }

    public ResponsePageEntity<UserEntity> searchByPage(UserConditionEntity userConditionEntity) {
        int count = userMapper.searchCount(userConditionEntity);
        if (count == 0) {
            return ResponsePageEntity.buildEmpty(userConditionEntity);
        }
        List<UserEntity> userEntities = userMapper.searchByCondition(userConditionEntity);
        return ResponsePageEntity.build(userConditionEntity, count, userEntities);
    }

    public int insert(UserEntity userEntity) {
        return userMapper.insert(userEntity);
    }

    public int update(UserEntity userEntity) {
        return userMapper.update(userEntity);
    }

    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }
}
