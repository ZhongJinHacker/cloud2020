package com.grady.springcloud.service.impl;

import com.grady.springcloud.mapper.StorageMapper;
import com.grady.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gradyjiang
 * @title: StorageServiceImpl
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/4/11
 */

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageDao;

    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}

