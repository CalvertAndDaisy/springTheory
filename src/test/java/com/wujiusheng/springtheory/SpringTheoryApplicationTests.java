package com.wujiusheng.springtheory;


import com.wujiusheng.springtheory.bean.request.AddRequest;
import com.wujiusheng.springtheory.common.response.ResponseResult;
import com.wujiusheng.springtheory.service.HelloWorldService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTheoryApplicationTests {

    @Autowired
    public HelloWorldService helloWorldService;
    @Test
    void contextLoads() {

        System.out.println("开始测试");
        AddRequest addRequest = new AddRequest();
        addRequest.setAge(12).setName("张三").setPassword("1234");
        ResponseResult<Object> add = helloWorldService.add(addRequest);
        System.out.println("结束测试");
        System.out.println(add.toString());

    }

}
