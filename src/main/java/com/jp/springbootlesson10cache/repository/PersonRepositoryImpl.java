package com.jp.springbootlesson10cache.repository;

import com.jp.springbootlesson10cache.entity.Person;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 张俊鹏 on 4/4/2018
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

//    private final Map<String, Person> repository = new HashMap<>();
//
//    @Override
//    public Person findPerson(String id) {
//        return repository.get( id );
//    }
//
//    @Override
//    public boolean savePerson(Person person) {
//        return repository.putIfAbsent( person.getId(), person ) == null;
//    }


    @Resource
    private RedisTemplate<String, Person> redisTemplate;


    @Override
    public Person findPerson(String id) {
        return redisTemplate.opsForValue().get( id );
    }

    @Override
    public boolean savePerson(Person person) {
        redisTemplate.opsForValue().set( person.getId(), person );
        return true;
    }
}
