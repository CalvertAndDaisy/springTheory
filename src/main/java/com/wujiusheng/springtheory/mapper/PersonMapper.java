package com.wujiusheng.springtheory.mapper;

import com.wujiusheng.springtheory.bean.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Project: spring-theory
 * @Package: com.wujiusheng.springtheory.mapper
 * @Author: wujiusheng
 * @Emial: wujiusheng@uni-ubi.com
 * @Date: 2020 年 08 月 10 号 16:13
 * @Description: TODO
 */
@Mapper
public interface PersonMapper {

    /** 添加*/
    public int add(Person person);


    /** 查询所有*/
    public List<Person> query();

    /** 根据姓名和密码查询*/
    public Person getByNameAndPassword(@Param("name") String name,@Param("password") String password);
}
