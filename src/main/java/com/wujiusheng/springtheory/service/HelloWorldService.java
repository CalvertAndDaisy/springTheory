package com.wujiusheng.springtheory.service;

import com.wujiusheng.springtheory.bean.request.AddRequest;
import com.wujiusheng.springtheory.bean.response.QueryResponse;
import com.wujiusheng.springtheory.common.response.ResponseResult;

import java.util.List;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.service.serviceImpl
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 19:50
 * @Description: TODO
 */
public interface HelloWorldService {

    /** 添加 */
    public ResponseResult<Object> add(AddRequest request);

    public ResponseResult<List<QueryResponse>> query();

    public ResponseResult<QueryResponse> getByNameAndPassword(String name, String password);

    /**
     *  登录
     */
    ResponseResult<String> login(String name, String password);
}
