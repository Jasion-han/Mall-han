package com.net.han.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName RequestPageEntity @Description TODO
 *
 * @author han @Date 2024/10/26 17:30 @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPageEntity implements Serializable {

    private static final int DEFAULT_PAGE_SIZE = 10;

    private Integer pageNo = 1;

    private Integer pageSize = DEFAULT_PAGE_SIZE;

    public Integer getPageBegin() {
        if (Objects.isNull(this.pageNo)) {
            this.pageNo = 1;
        }

        if (Objects.isNull(this.pageSize)) {
            this.pageSize = DEFAULT_PAGE_SIZE;
        }

        return (this.pageNo - 1) * this.pageSize;
    }
}
