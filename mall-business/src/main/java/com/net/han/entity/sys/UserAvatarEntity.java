package com.net.han.entity.sys;

import com.net.han.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户头像实体
 * 
 * @author han
 * @date 2024-10-27 12:45:30
 */
@ApiModel("用户头像实体")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserAvatarEntity extends BaseEntity {
	

	/**
	 * 文件名
	 */
	@ApiModelProperty("文件名")
	private String fileName;

	/**
	 * 路径
	 */
	@ApiModelProperty("路径")
	private String path;

	/**
	 * 大小
	 */
	@ApiModelProperty("大小")
	private String fileSize;
}
