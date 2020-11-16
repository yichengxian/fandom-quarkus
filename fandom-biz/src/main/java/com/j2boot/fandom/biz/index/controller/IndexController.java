package com.j2boot.fandom.biz.index.controller;

import com.j2boot.fandom.biz.index.service.IndexService;
import com.j2boot.fandom.common.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private IndexService indexService;

    @GetMapping("/")
    public CommonResult<String> index(){
       String str = indexService.index();
       return CommonResult.success(str);
    }

}
