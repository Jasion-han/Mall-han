package com.net.han.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName BusinessException @Description
 *
 * @author han @Date 2024/10/27 16:41 @Version 1.0
 */

@AllArgsConstructor
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -7911304467241239016L;

    private int code;

    private String message;

    public BusinessException() {
        super();
    }
}
