package com.net.han.entity.sys;

import com.net.han.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户角色关联实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("用户角色关联实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRoleEntity extends BaseEntity {
	

	/**
	 * 用户ID
	 */
	@ApiModelProperty("用户ID")
	private Long userId;

	/**
	 * 角色ID
	 */
	@ApiModelProperty("角色ID")
	private Long roleId;
}
