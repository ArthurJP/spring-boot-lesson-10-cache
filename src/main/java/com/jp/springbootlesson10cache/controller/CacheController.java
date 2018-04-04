package com.jp.springbootlesson10cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 张俊鹏 on 4/3/2018
 */
@RestController
@RequestMapping("cache")
public class CacheController {

    @Resource(name = "simpleCacheManager")
    private CacheManager simpleCacheManager;

    @PostMapping("save")
    public Map<String, Object> save(@RequestParam String key, @RequestParam String value) {
        Cache cache = simpleCacheManager.getCache( "cache-1" );
        cache.put( key, value );

        Map<String, Object> result = new HashMap<>();
        result.put( key, value );
        return result;
    }
}
