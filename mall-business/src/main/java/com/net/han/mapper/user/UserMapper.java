package com.net.han.mapper.user;

import com.net.han.entity.user.UserConditionEntity;
import com.net.han.entity.user.UserEntity;

import java.util.List;

/**
 * @ClassName UserMapper @Description  
 *
 * @author han @Date 2024/10/26 17:52 @Version 1.0
 */
public interface UserMapper {

    UserEntity findById(Long id);

    List<UserEntity> searchByCondition(UserConditionEntity userConditionEntity);

    int searchCount(UserConditionEntity userConditionEntity);

    int insert(UserEntity userEntity);

    int update(UserEntity userEntity);

    int deleteById(Long id);

}
