package com.net.han.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName DelEnum @Description TODO
 *
 * @author han @Date 2024/10/26 17:51 @Version 1.0
 */

@AllArgsConstructor
@Getter
public enum DelEnum {

    YES(1, "是"),
    NO(0, "否");

    private Integer value;
    private String desc;
}
