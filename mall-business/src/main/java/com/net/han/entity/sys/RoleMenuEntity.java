package com.net.han.entity.sys;

import com.net.han.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 角色菜单关联实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("角色菜单关联实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleMenuEntity extends BaseEntity {
	

	/**
	 * 角色ID
	 */
	@ApiModelProperty("角色ID")
	private Long roleId;

	/**
	 * 菜单ID
	 */
	@ApiModelProperty("菜单ID")
	private Long menuId;
}
