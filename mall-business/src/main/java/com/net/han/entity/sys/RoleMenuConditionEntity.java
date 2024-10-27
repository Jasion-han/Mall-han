package com.net.han.entity.sys;

import com.net.han.entity.RequestPageEntity;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色菜单关联查询条件实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("角色菜单关联查询条件实体")
@Data
public class RoleMenuConditionEntity extends RequestPageEntity {
	

	/**
	 *  ID
     */
	@ApiModelProperty("ID")
	private Long id;

	/**
	 *  角色ID
     */
	@ApiModelProperty("角色ID")
	private Long roleId;

	/**
	 *  菜单ID
     */
	@ApiModelProperty("菜单ID")
	private Long menuId;
}
