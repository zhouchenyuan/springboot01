package com.zcy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zcy
 * @create 2019/8/27 11:23
 */
@RestController
public class TestController {

    @GetMapping("/getMessage")
    public Map<String,Object> getMessage(){
        Map<String,Object> map = new HashMap<>();
        map.put("message","ffirst demo");
        return map;
    }
}
