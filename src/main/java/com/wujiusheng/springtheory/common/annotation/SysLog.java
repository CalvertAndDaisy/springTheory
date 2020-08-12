package com.wujiusheng.springtheory.common.annotation;

import java.lang.annotation.*;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.common.annotation
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 12 号 15:39
 * @Description: TODO
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}
