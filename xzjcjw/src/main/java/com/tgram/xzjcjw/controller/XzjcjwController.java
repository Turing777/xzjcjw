package com.tgram.xzjcjw.controller;

import com.tgram.xzjcjw.entity.Person;
import com.tgram.xzjcjw.service.IXzjcjwService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/xzjcjw")
public class XzjcjwController {

    private final Log logger = LogFactory.getLog(XzjcjwController.class);

    @RequestMapping(value = "/test/{ori}", method = RequestMethod.GET)
    public String test(@PathVariable("ori") String ori) {
        return ori;
    }

    private IXzjcjwService xzjcjwService;

    @Autowired
    public void setTestService(IXzjcjwService xzjcjwService) {
        this.xzjcjwService = xzjcjwService;
    }

    @RequestMapping(value = "/test/{userId}/{userName}", method = RequestMethod.GET)
    public String test(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
        Person person = new Person();
        person.setUserId(userId);
        person.setUserName(userName);
        xzjcjwService.insert(person);
        return "success";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Person> getAll() {
        return xzjcjwService.select();
    }
}
