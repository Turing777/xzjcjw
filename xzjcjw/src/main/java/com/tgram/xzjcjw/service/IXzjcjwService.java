package com.tgram.xzjcjw.service;

import com.tgram.xzjcjw.entity.Person;

import java.util.List;

public interface IXzjcjwService {

    void insert(Person person);

    List<Person> select();
}
