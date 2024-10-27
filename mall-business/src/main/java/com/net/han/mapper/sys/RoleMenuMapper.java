package com.net.han.mapper.sys;

import com.net.han.entity.sys.RoleMenuConditionEntity;
import com.net.han.entity.sys.RoleMenuEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 角色菜单关联 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenuEntity, RoleMenuConditionEntity> {
	/**
	 * 查询角色菜单关联信息
	 *
	 * @param id 角色菜单关联ID
	 * @return 角色菜单关联信息
	 */
	RoleMenuEntity findById(Long id);

	/**
	 * 根据条件查询角色菜单关联列表
	 *
	 * @param roleMenuConditionEntity 角色菜单关联信息
	 * @return 角色菜单关联集合
	 */
	List<RoleMenuEntity> searchByCondition(RoleMenuConditionEntity roleMenuConditionEntity);

	/**
	 * 根据条件查询角色菜单关联数量
	 *
	 * @param roleMenuConditionEntity 角色菜单关联信息
	 * @return 角色菜单关联集合
	 */
	int searchCount(RoleMenuConditionEntity roleMenuConditionEntity);

	/**
	 * 添加角色菜单关联
	 *
	 * @param roleMenuEntity 角色菜单关联信息
	 * @return 结果
	 */
	int insert(RoleMenuEntity roleMenuEntity);

	/**
	 * 修改角色菜单关联
	 *
	 * @param roleMenuEntity 角色菜单关联信息
	 * @return 结果
	 */
	int update(RoleMenuEntity roleMenuEntity);

	/**
	 * 删除角色菜单关联
	 *
	 * @param id 角色菜单关联ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
