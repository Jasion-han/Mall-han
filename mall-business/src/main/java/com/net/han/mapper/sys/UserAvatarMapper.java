package com.net.han.mapper.sys;

import com.net.han.entity.sys.UserAvatarConditionEntity;
import com.net.han.entity.sys.UserAvatarEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户头像 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface UserAvatarMapper extends BaseMapper<UserAvatarEntity, UserAvatarConditionEntity> {
	/**
	 * 查询用户头像信息
	 *
	 * @param id 用户头像ID
	 * @return 用户头像信息
	 */
	UserAvatarEntity findById(Long id);

	/**
	 * 根据条件查询用户头像列表
	 *
	 * @param userAvatarConditionEntity 用户头像信息
	 * @return 用户头像集合
	 */
	List<UserAvatarEntity> searchByCondition(UserAvatarConditionEntity userAvatarConditionEntity);

	/**
	 * 根据条件查询用户头像数量
	 *
	 * @param userAvatarConditionEntity 用户头像信息
	 * @return 用户头像集合
	 */
	int searchCount(UserAvatarConditionEntity userAvatarConditionEntity);

	/**
	 * 添加用户头像
	 *
	 * @param userAvatarEntity 用户头像信息
	 * @return 结果
	 */
	int insert(UserAvatarEntity userAvatarEntity);

	/**
	 * 修改用户头像
	 *
	 * @param userAvatarEntity 用户头像信息
	 * @return 结果
	 */
	int update(UserAvatarEntity userAvatarEntity);

	/**
	 * 删除用户头像
	 *
	 * @param id 用户头像ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
