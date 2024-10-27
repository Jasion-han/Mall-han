package com.net.han.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.net.han.mapper.sys.JobMapper;
import com.net.han.entity.sys.JobConditionEntity;
import com.net.han.entity.sys.JobEntity;
import com.net.han.entity.ResponsePageEntity;
/**
 * 岗位 服务层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Service
public class JobService {

	@Autowired
	private JobMapper jobMapper;

	/**
     * 查询岗位信息
     *
     * @param id 岗位ID
     * @return 岗位信息
     */
	public JobEntity findById(Long id) {
	    return jobMapper.findById(id);
	}

	/**
     * 根据条件分页查询岗位列表
     *
     * @param jobConditionEntity 岗位信息
     * @return 岗位集合
     */
	public ResponsePageEntity<JobEntity> searchByPage(JobConditionEntity jobConditionEntity) {
		int count = jobMapper.searchCount(jobConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(jobConditionEntity);
		}
		List<JobEntity> dataList = jobMapper.searchByCondition(jobConditionEntity);
		return ResponsePageEntity.build(jobConditionEntity, count, dataList);
	}

    /**
     * 新增岗位
     *
     * @param jobEntity 岗位信息
     * @return 结果
     */
	public int insert(JobEntity jobEntity) {
	    return jobMapper.insert(jobEntity);
	}

	/**
     * 修改岗位
     *
     * @param jobEntity 岗位信息
     * @return 结果
     */
	public int update(JobEntity jobEntity) {
	    return jobMapper.update(jobEntity);
	}

	/**
	 * 删除岗位对象
	 *
	 * @param id 系统ID
	 * @return 结果
	 */
	public int deleteById(Long id) {
		return jobMapper.deleteById(id);
	}

}
