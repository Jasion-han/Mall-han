package com.net.han.util;

/**
 * @ClassName ApiResultUtil
 *
 * @author han @Date 2024/10/27 17:29
 */

public class ApiResultUtil {

    /**
     * 为了防止调用者new这个类的实例对象
     */
    private ApiResultUtil() {

    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(ApiResult.OK, null, data);
    }

    public static <T> ApiResult<T> success() {
        return success(null);
    }

    public static <T> ApiResult<T> error(int code, String message) {
        return new ApiResult<>(code, message, null);
    }
}
