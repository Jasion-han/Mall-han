package com.net.han.entity.sys;

import com.net.han.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色部门关联实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("角色部门关联实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDeptEntity extends BaseEntity {
	

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
