package com.net.han.mapper.sys;

import com.net.han.entity.sys.RoleConditionEntity;
import com.net.han.entity.sys.RoleEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 角色 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface RoleMapper extends BaseMapper<RoleEntity, RoleConditionEntity> {
	/**
	 * 查询角色信息
	 *
	 * @param id 角色ID
	 * @return 角色信息
	 */
	RoleEntity findById(Long id);

	/**
	 * 根据条件查询角色列表
	 *
	 * @param roleConditionEntity 角色信息
	 * @return 角色集合
	 */
	List<RoleEntity> searchByCondition(RoleConditionEntity roleConditionEntity);

	/**
	 * 根据条件查询角色数量
	 *
	 * @param roleConditionEntity 角色信息
	 * @return 角色集合
	 */
	int searchCount(RoleConditionEntity roleConditionEntity);

	/**
	 * 添加角色
	 *
	 * @param roleEntity 角色信息
	 * @return 结果
	 */
	int insert(RoleEntity roleEntity);

	/**
	 * 修改角色
	 *
	 * @param roleEntity 角色信息
	 * @return 结果
	 */
	int update(RoleEntity roleEntity);

	/**
	 * 删除角色
	 *
	 * @param id 角色ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
