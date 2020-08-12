package com.wujiusheng.springtheory.common.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.common.response
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 20:42
 * @Description: TODO
 */
@Data
@Accessors(chain = true)
public class CodeMsg {

    private int code;

    private String msg;


    private Boolean success;

    public  CodeMsg(){

    }

    public CodeMsg(int code, String msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    // 带自定义格式化参数的错误信息
    public CodeMsg fillArgs(Object...args){
        int code  = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code,message,false);

    }

    /**
     * 通用异常
     */
    public static CodeMsg SUCCESS = new CodeMsg(0, "SUCESS",true);
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常",false);
    public static CodeMsg BIND_ERROR = new CodeMsg(500101, "参数校验异常:%s",false);
    /**
     * 登录模块5002XX
     */
    public static final CodeMsg PASSWORD_EMPTY = new CodeMsg(500211, "密码不能为空",false);
    public static final CodeMsg MOBILE_EMPTY = new CodeMsg(500211, "手机号不能为空",false);
    public static final CodeMsg MOBILE_ERROR = new CodeMsg(500211, "手机号格式错误",false);
    public static final CodeMsg USER_NOT_EXITS = new CodeMsg(500211, "用户不存在",false);
    public static final CodeMsg PASSWORD_ERROR = new CodeMsg(500211, "密码错误",false);
}
