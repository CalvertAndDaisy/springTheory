package com.wujiusheng.springtheory.controller;

import com.wujiusheng.springtheory.bean.request.AddRequest;
import com.wujiusheng.springtheory.bean.response.QueryResponse;
import com.wujiusheng.springtheory.common.response.ResponseResult;
import com.wujiusheng.springtheory.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.controller
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 14:59
 * @Description: TODO
 */
@RequestMapping("/hello")
@RestController
public class HelloworldController {

    @Resource
    public HelloWorldService helloWorldService;


    public static final String PATH ="/index";
    @RequestMapping(PATH)
    public String hello(){
        return "index";
    }

    /** 跳转到login 页面*/
    @RequestMapping("/login")
    public String show(){
        return  "login";
    }

    /**
     * 登录
     */

    @RequestMapping(value="/loginIn", method = RequestMethod.GET)
    public ResponseResult<String> Login(String name, String password) {
        ResponseResult<String> responseResult = helloWorldService.login(name,password);
        return responseResult;
    }


    /** 添加 */
    @PostMapping("/add")
    public ResponseResult<Object> add(@RequestBody AddRequest addRequest){
        ResponseResult<Object> resposeResult = helloWorldService.add(addRequest);
        return resposeResult;

    }


    /** 查询所有 */
    @GetMapping("/queryAll")
    public ResponseResult<List<QueryResponse>> queryAll() throws Exception{
        ResponseResult<List<QueryResponse>> listResponseResult = helloWorldService.query();
        Thread.sleep(2000L);
        System.out.println("休眠了2 秒钟");
        return listResponseResult;
    }

    /** 根据名字和密码查询*/
    @GetMapping("/get")
    public ResponseResult<QueryResponse> getByCondition(String name, String password){
        ResponseResult<QueryResponse> responseResult = helloWorldService.getByNameAndPassword(name, password);
        return responseResult;
    }



    /** 修改 */

    /** 删除*/


    /** 添加 */


}

