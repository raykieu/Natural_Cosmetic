package com.qfedu.natural_cosmetic.controller;

import com.qfedu.natural_cosmetic.entity.Cosmetic;
import com.qfedu.natural_cosmetic.service.CosmeticService;
import com.qfedu.natural_cosmetic.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "网页展示",tags = "展示信息")
@RestController
public class CosmeticController {
    @Autowired
    private CosmeticService cosmeticService;
@ApiOperation(value = "没有参数",notes = "查询首页")
@GetMapping("/show.do")
public R showCosmetic(){

    Cosmetic cosmetic = cosmeticService.queryInfo();
    return R.setOK("展示信息",cosmetic);
}


}
