package com.wujiusheng.springtheory.common.aspect;

import org.springframework.stereotype.Component;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.common.aspect
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 12 号 15:35
 * @Description: TODO
 */
//@Aspect
@Component
public class SysLogAspect {


 /*   @Pointcut("@annotation(com.wujiusheng.springtheory.common.annotation.SysLog)")
    public void logPointCut() {

    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        saveSysLog(point, time);

        return result;
    }

    private void saveSysLog(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        ScSysLogEntity sysLog = new ScSysLogEntity();
        SysLog syslog = method.getAnnotation(SysLog.class);
        if(syslog != null){
            //注解上的描述
            sysLog.setOperation(syslog.value());
        }

        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLog.setMethod(className + "." + methodName + "()");

        //请求的参数
        Object[] args = joinPoint.getArgs();
        try{
            String params = new Gson().toJson(args[0]);
            if(params.length()<=5000){//base64文件参数太长暂时去掉
                sysLog.setParams(params);
            }
        }catch (Exception e){

        }

        //获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        //设置IP地址
        sysLog.setIp(IPUtils.getIpAddr(request));

        //用户名
        ScSysUserEntity entity = ((ScSysUserEntity) SecurityUtils.getSubject().getPrincipal());

        sysLog.setUsername(entity.getUsername());
        sysLog.setUserId(entity.getUserId());
        sysLog.setVillageId(entity.getVillageId());
        sysLog.setTime(time);
        sysLog.setCreateDate(new Date());
        //保存系统日志
        sysLogService.insert(sysLog);
    }*/
}
