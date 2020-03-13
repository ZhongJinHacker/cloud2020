package com.grady.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gradyjiang
 * @title: Payment
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/3/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;

    private String serial;
}
