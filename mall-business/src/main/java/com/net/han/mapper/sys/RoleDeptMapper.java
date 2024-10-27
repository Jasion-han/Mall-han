package com.net.han.mapper.sys;

import com.net.han.entity.sys.RoleDeptConditionEntity;
import com.net.han.entity.sys.RoleDeptEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 角色部门关联 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface RoleDeptMapper extends BaseMapper<RoleDeptEntity, RoleDeptConditionEntity> {
	/**
	 * 查询角色部门关联信息
	 *
	 * @param id 角色部门关联ID
	 * @return 角色部门关联信息
	 */
	RoleDeptEntity findById(Long id);

	/**
	 * 根据条件查询角色部门关联列表
	 *
	 * @param roleDeptConditionEntity 角色部门关联信息
	 * @return 角色部门关联集合
	 */
	List<RoleDeptEntity> searchByCondition(RoleDeptConditionEntity roleDeptConditionEntity);

	/**
	 * 根据条件查询角色部门关联数量
	 *
	 * @param roleDeptConditionEntity 角色部门关联信息
	 * @return 角色部门关联集合
	 */
	int searchCount(RoleDeptConditionEntity roleDeptConditionEntity);

	/**
	 * 添加角色部门关联
	 *
	 * @param roleDeptEntity 角色部门关联信息
	 * @return 结果
	 */
	int insert(RoleDeptEntity roleDeptEntity);

	/**
	 * 修改角色部门关联
	 *
	 * @param roleDeptEntity 角色部门关联信息
	 * @return 结果
	 */
	int update(RoleDeptEntity roleDeptEntity);

	/**
	 * 删除角色部门关联
	 *
	 * @param id 角色部门关联ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
