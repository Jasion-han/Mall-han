package com.net.han.mapper.sys;

import com.net.han.entity.sys.JobConditionEntity;
import com.net.han.entity.sys.JobEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 岗位 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface JobMapper extends BaseMapper<JobEntity, JobConditionEntity> {
	/**
	 * 查询岗位信息
	 *
	 * @param id 岗位ID
	 * @return 岗位信息
	 */
	JobEntity findById(Long id);

	/**
	 * 根据条件查询岗位列表
	 *
	 * @param jobConditionEntity 岗位信息
	 * @return 岗位集合
	 */
	List<JobEntity> searchByCondition(JobConditionEntity jobConditionEntity);

	/**
	 * 根据条件查询岗位数量
	 *
	 * @param jobConditionEntity 岗位信息
	 * @return 岗位集合
	 */
	int searchCount(JobConditionEntity jobConditionEntity);

	/**
	 * 添加岗位
	 *
	 * @param jobEntity 岗位信息
	 * @return 结果
	 */
	int insert(JobEntity jobEntity);

	/**
	 * 修改岗位
	 *
	 * @param jobEntity 岗位信息
	 * @return 结果
	 */
	int update(JobEntity jobEntity);

	/**
	 * 删除岗位
	 *
	 * @param id 岗位ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
