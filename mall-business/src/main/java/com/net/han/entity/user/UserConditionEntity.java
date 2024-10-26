package com.net.han.entity.user;

import com.net.han.entity.RequestPageEntity;
import lombok.Data;

/**
 * @ClassName UserConditionEntity @Description TODO
 *
 * @author han @Date 2024/10/26 17:28 @Version 1.0
 */

@Data
public class UserConditionEntity extends RequestPageEntity {

    private Long id;

    private String userName;
}
