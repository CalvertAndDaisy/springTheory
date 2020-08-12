package com.wujiusheng.springtheory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.controller
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 11 号 13:33
 * @Description: TODO
 */
@RequestMapping("/hello")
@RestController
public class PersonController {


    public int  add (){
        return 1;
    }
}
