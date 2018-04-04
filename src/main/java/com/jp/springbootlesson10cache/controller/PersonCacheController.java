package com.jp.springbootlesson10cache.controller;

import com.jp.springbootlesson10cache.entity.Person;
import com.jp.springbootlesson10cache.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by 张俊鹏 on 4/4/2018
 */
@RestController
@RequestMapping("person")
public class PersonCacheController {

    @Resource
    private PersonRepository repository;

    @PostMapping("save")
    public Person save(@RequestBody Person person){
        repository.savePerson( person );
        return person;
    }

    @GetMapping("get/{id}")
    public Person get(@PathVariable String id){
        return repository.findPerson( id );
    }
}
