package com.jp.springbootlesson10cache.repository;

import com.jp.springbootlesson10cache.entity.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by 张俊鹏 on 4/4/2018
 */
@NoRepositoryBean
public interface PersonRepository {

    @Cacheable(cacheNames = "persons")
    Person findPerson(String id);

    boolean savePerson(Person person);
}
