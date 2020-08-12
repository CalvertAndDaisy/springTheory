package com.wujiusheng.springtheory.common.response;

import lombok.Data;
import org.thymeleaf.util.StringUtils;

import java.util.Objects;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.common
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 19:54
 * @Description: TODO
 */
@Data
public class ResponseResult<T> {

    /* 返回编码code */
    private int code;

    /* 消息内容 */
    private String msg;

    /* 是否成功，如果成功就返回true ,如果失败就返回false */
    private Boolean success;

    /* 实际返回的数据 */
    private T data;

    /* 成功时候返回数据 */
    public ResponseResult(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
        this.success = true;
    }


    /* 当发生错误的时候 */
    public ResponseResult(CodeMsg msg){
        if(Objects.isNull(msg)){
            return;
        }
        this.code = msg.getCode();
        this.msg = msg.getMsg();
        this.success = msg.getSuccess();

    }

    /**
     * 失败的时候调用
     */

    public static <T>  ResponseResult<T>  error(CodeMsg msg){
        return new ResponseResult<T>(msg);
    }

    /**
     *成功的时候调用
     */

    public static <T> ResponseResult<T> success(T data){
        return new ResponseResult<T>(data);
    }











}
