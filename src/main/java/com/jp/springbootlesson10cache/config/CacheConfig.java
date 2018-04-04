package com.jp.springbootlesson10cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * Created by 张俊鹏 on 4/3/2018
 */
@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager simpleCacheManager(){
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        ConcurrentMapCache cache=new ConcurrentMapCache( "cache-1" );
        ConcurrentMapCache personsCache=new ConcurrentMapCache( "persons" );

        simpleCacheManager.setCaches( Arrays.asList(cache,personsCache) );

        return simpleCacheManager;
    }
}
