package com.j2boot.fandom.biz.index.controller;

import com.j2boot.fandom.biz.index.service.IndexService;
import com.j2boot.fandom.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/")
    public CommonResult<String> index(){
       String str = indexService.index();
       return CommonResult.success(str);
    }

}
