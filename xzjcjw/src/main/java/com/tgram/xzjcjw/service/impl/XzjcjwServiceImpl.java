package com.tgram.xzjcjw.service.impl;

import com.tgram.xzjcjw.entity.Person;
import com.tgram.xzjcjw.mapper.UserMapper;
import com.tgram.xzjcjw.service.IXzjcjwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("xzjcjwService")
public class XzjcjwServiceImpl implements IXzjcjwService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void insert(Person person) {
        userMapper.insert(person);
    }

    @Override
    public List<Person> select() {
        return userMapper.selectAllUser();
    }
}
