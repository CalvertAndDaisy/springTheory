package com.wujiusheng.springtheory.common.annotation;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.common.annotation
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 12 号 15:49
 * @Description: TODO
 */
@Data
@Accessors(chain = true)
public class ScSysLogEntity {

    private String userName;

    private Integer userId;

    private Long villageId;

    private Date creatDate;

    private String method;

    private String time;


}
