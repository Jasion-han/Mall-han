package  com.net.han.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.sys.RoleConditionEntity;
import com.net.han.entity.sys.RoleEntity;
import com.net.han.service.sys.RoleService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

/**
 * 角色 接口层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Api(tags = "角色操作", description = "角色接口")
@RestController
@RequestMapping("/v1/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	/**
	 * 通过id查询角色信息
	 *
	 * @param id 系统ID
	 * @return 角色信息
	 */
	@ApiOperation(notes = "通过id查询角色信息", value = "通过id查询角色信息")
	@GetMapping("/findById")
	public RoleEntity findById(Long id) {
		return roleService.findById(id);
	}

	/**
    * 根据条件查询角色列表
    *
    * @param roleConditionEntity 条件
    * @return 角色列表
    */
	@ApiOperation(notes = "根据条件查询角色列表", value = "根据条件查询角色列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<RoleEntity> searchByPage(@RequestBody RoleConditionEntity roleConditionEntity) {
		return roleService.searchByPage(roleConditionEntity);
	}


	/**
     * 添加角色
     *
     * @param roleEntity 角色实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加角色", value = "添加角色")
	@PostMapping("/insert")
	public int insert(@RequestBody RoleEntity roleEntity) {
		return roleService.insert(roleEntity);
	}

	/**
     * 修改角色
     *
     * @param roleEntity 角色实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改角色", value = "修改角色")
	@PostMapping("/update")
	public int update(@RequestBody RoleEntity roleEntity) {
		return roleService.update(roleEntity);
	}

	/**
	 * 删除角色
	 *
	 * @param id 角色ID
	 * @return 影响行数
	 */
	@ApiOperation(notes = "删除角色", value = "删除角色")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return roleService.deleteById(id);
	}
}
