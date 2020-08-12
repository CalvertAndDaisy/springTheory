package com.wujiusheng.springtheory.service.serviceImpl;

import com.wujiusheng.springtheory.bean.entity.Person;
import com.wujiusheng.springtheory.bean.request.AddRequest;
import com.wujiusheng.springtheory.bean.response.QueryResponse;
import com.wujiusheng.springtheory.common.response.CodeMsg;
import com.wujiusheng.springtheory.common.response.ResponseResult;
import com.wujiusheng.springtheory.mapper.PersonMapper;
import com.wujiusheng.springtheory.service.HelloWorldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.service.serviceImpl
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 19:51
 * @Description: TODO
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    public PersonMapper personMapper;

    @Override
    public  ResponseResult<Object> add(AddRequest request) {
        Person person = new Person();
        ResponseResult<QueryResponse> tempPerson = this.getByNameAndPassword(request.getName(), request.getPassword());

        if(!Objects.isNull(tempPerson.getData())){
            return new ResponseResult<>(new CodeMsg().setCode(1001).setSuccess(false).setMsg("用户名和密码不唯一"));
        }
        person.setAge(request.getAge()).setName(request.getName()).setPassword(request.getPassword());
        int number = personMapper.add(person);
          if(number == 1){
              System.out.println("主键是："+ person.getId());
            return ResponseResult.success(true);
        }
        CodeMsg codeMsg = new CodeMsg(6001,"添加失败",false);
        return ResponseResult.error(codeMsg);
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public ResponseResult<List<QueryResponse>> query() {
        List<Person> persons =  personMapper.query();
        List<QueryResponse> queryResponses = persons.parallelStream().map(person -> {
            return new QueryResponse().setAge(person.getAge()).setId(person.getId()).setName(person.getName())
                    .setPassword(person.getPassword());
        }).collect(Collectors.toList());

        return new ResponseResult<>(queryResponses);
    }

    /**
     *  通过名字和姓名来查询
     * @param name
     * @param password
     * @return
     */
    @Override
    public ResponseResult<QueryResponse> getByNameAndPassword(String name, String password) {
        Person person = personMapper.getByNameAndPassword(name,password);
        if(Objects.isNull(person)){
            return new ResponseResult<>(new QueryResponse());
        }
        QueryResponse queryResponse = new QueryResponse().setAge(person.getAge()).setId(person.getId()).setName(person.getName())
                .setPassword(person.getPassword());

        return new ResponseResult<>(queryResponse);
    }
}
