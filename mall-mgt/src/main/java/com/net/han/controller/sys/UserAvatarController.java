package  com.net.han.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 import com.net.han.entity.ResponsePageEntity;
import com.net.han.entity.sys.UserAvatarConditionEntity;
import com.net.han.entity.sys.UserAvatarEntity;
import com.net.han.service.sys.UserAvatarService;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

/**
 * 用户头像 接口层
 *
 * @author han
 * @date 2024-10-27 12:45:30
 */
@Api(tags = "用户头像操作", description = "用户头像接口")
@RestController
@RequestMapping("/v1/userAvatar")
public class UserAvatarController {

	@Autowired
	private UserAvatarService userAvatarService;

	/**
	 * 通过id查询用户头像信息
	 *
	 * @param id 系统ID
	 * @return 用户头像信息
	 */
	@ApiOperation(notes = "通过id查询用户头像信息", value = "通过id查询用户头像信息")
	@GetMapping("/findById")
	public UserAvatarEntity findById(Long id) {
		return userAvatarService.findById(id);
	}

	/**
    * 根据条件查询用户头像列表
    *
    * @param userAvatarConditionEntity 条件
    * @return 用户头像列表
    */
	@ApiOperation(notes = "根据条件查询用户头像列表", value = "根据条件查询用户头像列表")
	@PostMapping("/searchByPage")
	public ResponsePageEntity<UserAvatarEntity> searchByPage(@RequestBody UserAvatarConditionEntity userAvatarConditionEntity) {
		return userAvatarService.searchByPage(userAvatarConditionEntity);
	}


	/**
     * 添加用户头像
     *
     * @param userAvatarEntity 用户头像实体
     * @return 影响行数
     */
	@ApiOperation(notes = "添加用户头像", value = "添加用户头像")
	@PostMapping("/insert")
	public int insert(@RequestBody UserAvatarEntity userAvatarEntity) {
		return userAvatarService.insert(userAvatarEntity);
	}

	/**
     * 修改用户头像
     *
     * @param userAvatarEntity 用户头像实体
     * @return 影响行数
     */
	@ApiOperation(notes = "修改用户头像", value = "修改用户头像")
	@PostMapping("/update")
	public int update(@RequestBody UserAvatarEntity userAvatarEntity) {
		return userAvatarService.update(userAvatarEntity);
	}

	/**
	 * 删除用户头像
	 *
	 * @param id 用户头像ID
	 * @return 影响行数
	 */
	@ApiOperation(notes = "删除用户头像", value = "删除用户头像")
	@PostMapping("/deleteById")
	public int deleteById(@RequestBody @NotNull Long id) {
		return userAvatarService.deleteById(id);
	}
}
