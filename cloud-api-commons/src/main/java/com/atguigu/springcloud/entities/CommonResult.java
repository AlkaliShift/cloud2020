package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shenghui
 * @version 1.0
 * @since 2020/7/13 14:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;

    private String message;

    private T data;

    public CommonResult(int code, String message) {
        this(code, message, null);
    }
}
