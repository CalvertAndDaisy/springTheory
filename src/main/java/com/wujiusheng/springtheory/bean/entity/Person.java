package com.wujiusheng.springtheory.bean.entity;


import lombok.*;
import lombok.experimental.Accessors;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.bean
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 15:02
 * @Description: TODO
 */
@Data
/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor*/
@Accessors(chain = true)
public class Person {

    private Integer id;

    private String  name;

    private Integer  age;

    private String password;




}

