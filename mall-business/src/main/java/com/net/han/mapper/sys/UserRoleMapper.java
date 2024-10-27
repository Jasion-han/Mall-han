package com.net.han.mapper.sys;

import com.net.han.entity.sys.UserRoleConditionEntity;
import com.net.han.entity.sys.UserRoleEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户角色关联 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface UserRoleMapper extends BaseMapper<UserRoleEntity, UserRoleConditionEntity> {
	/**
	 * 查询用户角色关联信息
	 *
	 * @param id 用户角色关联ID
	 * @return 用户角色关联信息
	 */
	UserRoleEntity findById(Long id);

	/**
	 * 根据条件查询用户角色关联列表
	 *
	 * @param userRoleConditionEntity 用户角色关联信息
	 * @return 用户角色关联集合
	 */
	List<UserRoleEntity> searchByCondition(UserRoleConditionEntity userRoleConditionEntity);

	/**
	 * 根据条件查询用户角色关联数量
	 *
	 * @param userRoleConditionEntity 用户角色关联信息
	 * @return 用户角色关联集合
	 */
	int searchCount(UserRoleConditionEntity userRoleConditionEntity);

	/**
	 * 添加用户角色关联
	 *
	 * @param userRoleEntity 用户角色关联信息
	 * @return 结果
	 */
	int insert(UserRoleEntity userRoleEntity);

	/**
	 * 修改用户角色关联
	 *
	 * @param userRoleEntity 用户角色关联信息
	 * @return 结果
	 */
	int update(UserRoleEntity userRoleEntity);

	/**
	 * 删除用户角色关联
	 *
	 * @param id 用户角色关联ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
