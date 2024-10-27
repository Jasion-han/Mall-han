package com.net.han.entity.sys;

import com.net.han.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 部门实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("部门实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptEntity extends BaseEntity {
	

	/**
	 * 名称
	 */
	@ApiModelProperty("名称")
	private String name;

	/**
	 * 上级部门ID
	 */
	@ApiModelProperty("上级部门ID")
	private Long pid;

	/**
	 * 有效状态 1:有效 0:无效
	 */
	@ApiModelProperty("有效状态 1:有效 0:无效")
	private Integer validStatus;
}
