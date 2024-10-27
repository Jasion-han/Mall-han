package com.net.han.mapper.sys;

import com.net.han.entity.sys.MenuConditionEntity;
import com.net.han.entity.sys.MenuEntity;
import com.net.han.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 菜单 mapper
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
public interface MenuMapper extends BaseMapper<MenuEntity, MenuConditionEntity> {
	/**
	 * 查询菜单信息
	 *
	 * @param id 菜单ID
	 * @return 菜单信息
	 */
	MenuEntity findById(Long id);

	/**
	 * 根据条件查询菜单列表
	 *
	 * @param menuConditionEntity 菜单信息
	 * @return 菜单集合
	 */
	List<MenuEntity> searchByCondition(MenuConditionEntity menuConditionEntity);

	/**
	 * 根据条件查询菜单数量
	 *
	 * @param menuConditionEntity 菜单信息
	 * @return 菜单集合
	 */
	int searchCount(MenuConditionEntity menuConditionEntity);

	/**
	 * 添加菜单
	 *
	 * @param menuEntity 菜单信息
	 * @return 结果
	 */
	int insert(MenuEntity menuEntity);

	/**
	 * 修改菜单
	 *
	 * @param menuEntity 菜单信息
	 * @return 结果
	 */
	int update(MenuEntity menuEntity);

	/**
	 * 删除菜单
	 *
	 * @param id 菜单ID
	 * @return 结果
	 */
	int deleteById(Long id);
}
