package com.grady.springcloud.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author gradyjiang
 * @title: AccountMapper
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */
public interface AccountMapper {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
