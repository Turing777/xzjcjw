package com.tgram.xzjcjw.mapper;

import com.tgram.xzjcjw.entity.Person;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> selectAllUser();
}
