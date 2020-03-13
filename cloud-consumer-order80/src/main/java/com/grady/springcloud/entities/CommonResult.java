package com.grady.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gradyjiang
 * @title: CommonResult
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
