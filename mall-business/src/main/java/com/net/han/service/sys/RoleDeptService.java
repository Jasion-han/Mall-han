package com.net.han.service.sys;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.net.han.mapper.sys.RoleDeptMapper;
import com.net.han.entity.sys.RoleDeptConditionEntity;
import com.net.han.entity.sys.RoleDeptEntity;
import com.net.han.entity.ResponsePageEntity;
/**
 * 角色部门关联 服务层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Service
public class RoleDeptService {

	@Autowired
	private RoleDeptMapper roleDeptMapper;

	/**
     * 查询角色部门关联信息
     *
     * @param id 角色部门关联ID
     * @return 角色部门关联信息
     */
	public RoleDeptEntity findById(Long id) {
	    return roleDeptMapper.findById(id);
	}

	/**
     * 根据条件分页查询角色部门关联列表
     *
     * @param roleDeptConditionEntity 角色部门关联信息
     * @return 角色部门关联集合
     */
	public ResponsePageEntity<RoleDeptEntity> searchByPage(RoleDeptConditionEntity roleDeptConditionEntity) {
		int count = roleDeptMapper.searchCount(roleDeptConditionEntity);
		if (count == 0) {
			return ResponsePageEntity.buildEmpty(roleDeptConditionEntity);
		}
		List<RoleDeptEntity> dataList = roleDeptMapper.searchByCondition(roleDeptConditionEntity);
		return ResponsePageEntity.build(roleDeptConditionEntity, count, dataList);
	}

    /**
     * 新增角色部门关联
     *
     * @param roleDeptEntity 角色部门关联信息
     * @return 结果
     */
	public int insert(RoleDeptEntity roleDeptEntity) {
	    return roleDeptMapper.insert(roleDeptEntity);
	}

	/**
     * 修改角色部门关联
     *
     * @param roleDeptEntity 角色部门关联信息
     * @return 结果
     */
	public int update(RoleDeptEntity roleDeptEntity) {
	    return roleDeptMapper.update(roleDeptEntity);
	}

	/**
	 * 删除角色部门关联对象
	 *
	 * @param id 系统ID
	 * @return 结果
	 */
	public int deleteById(Long id) {
		return roleDeptMapper.deleteById(id);
	}

}
