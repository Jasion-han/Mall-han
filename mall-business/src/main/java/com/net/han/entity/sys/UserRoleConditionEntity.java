package com.net.han.entity.sys;

import com.net.han.entity.RequestPageEntity;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户角色关联查询条件实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("用户角色关联查询条件实体")
@Data
public class UserRoleConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  用户ID
     */
	@ApiModelProperty("用户ID")
	private Long userId;

	/**
	 *  角色ID
     */
	@ApiModelProperty("角色ID")
	private Long roleId;
}
