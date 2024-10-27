package com.net.han.mapper.sys;

import com.net.han.entity.sys.DeptConditionEntity;
import com.net.han.entity.sys.DeptEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;

/**
 * 部门 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface DeptMapper extends BaseMapper<DeptEntity, DeptConditionEntity> {
	/**
     * 查询部门信息
     *
     * @param id 部门ID
     * @return 部门信息
     */
	DeptEntity findById(Long id);


	/**
	 * 根据条件查询部门列表
	 *
	 * @param deptConditionEntity 部门信息
	 * @return 部门集合
	 */
	List<DeptEntity> searchByCondition(DeptConditionEntity deptConditionEntity);

	/**
	 * 根据条件查询部门数量
	 *
	 * @param deptConditionEntity 部门信息
	 * @return 部门集合
	 */
	int searchCount(DeptConditionEntity deptConditionEntity);

	/**
     * 添加部门
     *
     * @param deptEntity 部门信息
     * @return 结果
     */
	int insert(DeptEntity deptEntity);

	/**
     * 修改部门
     *
     * @param deptEntity 部门信息
     * @return 结果
     */
	int update(DeptEntity deptEntity);

	/**
	 * 删除部门
	 *
	 * @param id 部门ID
	 * @return 结果
	 */
	int deleteById(Long id);
}