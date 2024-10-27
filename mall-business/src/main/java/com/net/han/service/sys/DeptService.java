package com.net.han.service.sys;

import java.util.List;

import com.net.han.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.net.han.mapper.sys.DeptMapper;
import com.net.han.entity.sys.DeptConditionEntity;
import com.net.han.entity.sys.DeptEntity;
import com.net.han.entity.ResponsePageEntity;

/**
 * 部门 服务层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Service
public class DeptService {

	@Autowired
	private DeptMapper deptMapper;

	/**
     * 查询部门信息
     *
     * @param id 部门ID
     * @return 部门信息
     */
	public DeptEntity findById(Long id) {
	    return deptMapper.findById(id);
	}

	/**
     * 根据条件分页查询部门列表
     *
     * @param deptConditionEntity 部门信息
     * @return 部门集合
     */
	public ResponsePageEntity<DeptEntity> searchByPage(DeptConditionEntity deptConditionEntity) {
		int count = deptMapper.searchCount(deptConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(deptConditionEntity);
		}
		List<DeptEntity> dataList = deptMapper.searchByCondition(deptConditionEntity);
		return ResponsePageEntity.build(deptConditionEntity, count, dataList);
	}

    /**
     * 新增部门
     *
     * @param deptEntity 部门信息
     * @return 结果
     */
	public int insert(DeptEntity deptEntity) {
	    return deptMapper.insert(deptEntity);
	}

	/**
     * 修改部门
     *
     * @param deptEntity 部门信息
     * @return 结果
     */
	public int update(DeptEntity deptEntity) {
	    return deptMapper.update(deptEntity);
	}

	/**
	 * 删除部门对象
	 *
	 * @param id 系统ID
	 * @return 结果
	 */
	public int deleteById(Long id) {
		return deptMapper.deleteById(id);
	}

}
