package com.net.han.service.sys;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.net.han.mapper.sys.UserMapper;
import com.net.han.entity.sys.UserConditionEntity;
import com.net.han.entity.sys.UserEntity;
import com.net.han.entity.ResponsePageEntity;
/**
 * 用户 服务层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
     * 查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
	public UserEntity findById(Long id) {
	    return userMapper.findById(id);
	}

	/**
     * 根据条件分页查询用户列表
     *
     * @param userConditionEntity 用户信息
     * @return 用户集合
     */
	public ResponsePageEntity<UserEntity> searchByPage(UserConditionEntity userConditionEntity) {
		int count = userMapper.searchCount(userConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(userConditionEntity);
		}
		List<UserEntity> dataList = userMapper.searchByCondition(userConditionEntity);
		return ResponsePageEntity.build(userConditionEntity, count, dataList);
	}

    /**
     * 新增用户
     *
     * @param userEntity 用户信息
     * @return 结果
     */
	public int insert(UserEntity userEntity) {
	    return userMapper.insert(userEntity);
	}

	/**
     * 修改用户
     *
     * @param userEntity 用户信息
     * @return 结果
     */
	public int update(UserEntity userEntity) {
	    return userMapper.update(userEntity);
	}

	/**
	 * 删除用户对象
	 *
	 * @param id 系统ID
	 * @return 结果
	 */
	public int deleteById(Long id) {
		return userMapper.deleteById(id);
	}

}
