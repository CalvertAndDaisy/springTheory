package com.wujiusheng.springtheory.bean.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.bean.request
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 21:20
 * @Description: TODO
 */
@Data
@Accessors(chain = true)
public class AddRequest {

    private String name;

    private Integer age;

    private String password;


}
