package com.grady.springcloud.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author gradyjiang
 * @title: StorageMapper
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */
public interface StorageMapper {

    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
