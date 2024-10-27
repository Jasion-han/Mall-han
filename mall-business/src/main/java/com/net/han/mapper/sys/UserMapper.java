package com.net.han.mapper.sys;

import com.net.han.entity.sys.UserConditionEntity;
import com.net.han.entity.sys.UserEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface UserMapper extends BaseMapper<UserEntity, UserConditionEntity> {
	/**
	 * 查询用户信息
	 *
	 * @param id 用户ID
	 * @return 用户信息
	 */
	UserEntity findById(Long id);

	/**
	 * 根据条件查询用户列表
	 *
	 * @param userConditionEntity 用户信息
	 * @return 用户集合
	 */
	List<UserEntity> searchByCondition(UserConditionEntity userConditionEntity);

	/**
	 * 根据条件查询用户数量
	 *
	 * @param userConditionEntity 用户信息
	 * @return 用户集合
	 */
	int searchCount(UserConditionEntity userConditionEntity);

	/**
	 * 添加用户
	 *
	 * @param userEntity 用户信息
	 * @return 结果
	 */
	int insert(UserEntity userEntity);

	/**
	 * 修改用户
	 *
	 * @param userEntity 用户信息
	 * @return 结果
	 */
	int update(UserEntity userEntity);

	/**
	 * 删除用户
	 *
	 * @param id 用户ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
