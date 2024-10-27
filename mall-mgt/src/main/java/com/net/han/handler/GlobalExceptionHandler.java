package com.net.han.handler;

import com.net.han.exception.BusinessException;
import com.net.han.util.ApiResult;
import com.net.han.util.ApiResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName GlobalExceptionHandler
 *
 * @author han @Date 2024/10/27 17:37
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public ApiResult handleException(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            log.info("业务异常：{}", e);
            return ApiResultUtil.error(businessException.getCode(), businessException.getMessage());
        }
        log.error("系统异常：{}", e);
        return ApiResultUtil.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "服务器内部错误");
    }
}
