package  com.net.han.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.sys.RoleDeptConditionEntity;
import com.net.han.entity.sys.RoleDeptEntity;
import com.net.han.service.sys.RoleDeptService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

/**
 * 角色部门关联 接口层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Api(tags = "角色部门关联操作", description = "角色部门关联接口")
@RestController
@RequestMapping("/v1/roleDept")
public class RoleDeptController {

	@Autowired
	private RoleDeptService roleDeptService;

	/**
	 * 通过id查询角色部门关联信息
	 *
	 * @param id 系统ID
	 * @return 角色部门关联信息
	 */
	@ApiOperation(notes = "通过id查询角色部门关联信息", value = "通过id查询角色部门关联信息")
	@GetMapping("/findById")
	public RoleDeptEntity findById(Long id) {
		return roleDeptService.findById(id);
	}

	/**
    * 根据条件查询角色部门关联列表
    *
    * @param roleDeptConditionEntity 条件
    * @return 角色部门关联列表
    */
	@ApiOperation(notes = "根据条件查询角色部门关联列表", value = "根据条件查询角色部门关联列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<RoleDeptEntity> searchByPage(@RequestBody RoleDeptConditionEntity roleDeptConditionEntity) {
		return roleDeptService.searchByPage(roleDeptConditionEntity);
	}


	/**
     * 添加角色部门关联
     *
     * @param roleDeptEntity 角色部门关联实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加角色部门关联", value = "添加角色部门关联")
	@PostMapping("/insert")
	public int insert(@RequestBody RoleDeptEntity roleDeptEntity) {
		return roleDeptService.insert(roleDeptEntity);
	}

	/**
     * 修改角色部门关联
     *
     * @param roleDeptEntity 角色部门关联实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改角色部门关联", value = "修改角色部门关联")
	@PostMapping("/update")
	public int update(@RequestBody RoleDeptEntity roleDeptEntity) {
		return roleDeptService.update(roleDeptEntity);
	}

	/**
	 * 删除角色部门关联
	 *
	 * @param id 角色部门关联ID
	 * @return 影响行数
	 */
	@ApiOperation(notes = "删除角色部门关联", value = "删除角色部门关联")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return roleDeptService.deleteById(id);
	}
}
