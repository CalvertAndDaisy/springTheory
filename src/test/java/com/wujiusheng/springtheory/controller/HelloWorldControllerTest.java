package com.wujiusheng.springtheory.controller;

import com.wujiusheng.springtheory.SpringTheoryApplication;
import com.wujiusheng.springtheory.bean.request.AddRequest;
import com.wujiusheng.springtheory.bean.response.QueryResponse;
import com.wujiusheng.springtheory.common.response.ResponseResult;
import com.wujiusheng.springtheory.service.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.controller
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 11 号 14:02
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTheoryApplication.class)
public class HelloWorldControllerTest {

    @Autowired
    public HelloWorldService helloWorldService;

    @Test
    public void addTest(){
        System.out.println("开始测试");
        AddRequest addRequest = new AddRequest();
        addRequest.setAge(12).setName("张三2222").setPassword("1234555");
        ResponseResult<Object> add = helloWorldService.add(addRequest);
        System.out.println("结束测试");
        System.out.println(add.toString());
    }

    @Test
    public void  queryTest(){
        System.out.println("开始查询所有");
        ResponseResult<List<QueryResponse>> query = helloWorldService.query();
        System.out.println("查询所有结束");

    }

    @Test
    public void  getByNameAndPasswordTest(){
        System.out.println("条件查询开始");
        String name = "朱元璋";
        String password = "99999";
        ResponseResult<QueryResponse> responseResult = helloWorldService.getByNameAndPassword(name, password);
        System.out.println(responseResult.getData().toString());
        System.out.println("条件查询结束");
    }
}
