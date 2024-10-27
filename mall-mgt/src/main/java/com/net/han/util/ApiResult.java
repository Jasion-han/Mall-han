package com.net.han.util;

import cn.hutool.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName ApiResult
 *
 * @author han @Date 2024/10/27 17:27
 */

@Data
@AllArgsConstructor
public class ApiResult<T> {

    public static final int OK = HttpStatus.HTTP_OK;

    private int code;

    private String message;

    private T data;
}
