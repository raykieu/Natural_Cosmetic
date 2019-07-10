package com.qfedu.natural_cosmetic.service.impl;

import com.qfedu.natural_cosmetic.dao.CosmeticDao;
import com.qfedu.natural_cosmetic.entity.Cosmetic;
import com.qfedu.natural_cosmetic.service.CosmeticService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CosmeticServiceImpl implements CosmeticService {
    @Autowired
    private CosmeticDao cosmeticDao;
    @Override
    public Cosmetic queryInfo() {
        return cosmeticDao.queryInfo();
    }
}
