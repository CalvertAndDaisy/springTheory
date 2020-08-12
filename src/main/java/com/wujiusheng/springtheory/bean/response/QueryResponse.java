package com.wujiusheng.springtheory.bean.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.bean.response
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 11 号 14:19
 * @Description: TODO
 */
@Data
@Accessors(chain = true)
public class QueryResponse {

    private Integer id;

    private  String name;

    private Integer age;

    private String password;

}



