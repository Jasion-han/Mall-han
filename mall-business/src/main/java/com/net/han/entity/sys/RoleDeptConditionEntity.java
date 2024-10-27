package com.net.han.entity.sys;

import com.net.han.entity.RequestPageEntity;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色部门关联查询条件实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("角色部门关联查询条件实体")
@Data
public class RoleDeptConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  
     */
	@ApiModelProperty("")
	private Long roleId;

	/**
	 *  
     */
	@ApiModelProperty("")
	private Long deptId;
}
