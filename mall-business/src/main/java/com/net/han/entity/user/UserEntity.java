package com.net.han.entity.user;

import com.net.han.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserEntity @Description  
 *
 * @author han @Date 2024/10/26 17:28 @Version 1.0
 */

@Data
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    private String userName;
}
