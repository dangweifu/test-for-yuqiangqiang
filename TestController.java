package com.xiaohei.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <class说明>： Created by WiuLuS on 2020/01/02.
 *
 * @author WiuLuS
 * @version 1.0.0
 * @date 2020/1/2 16:54
 */
@RestController
@RequestMapping
public class TestController {

    @PostMapping("/first")
    public Map testMethod(@RequestBody Map<String,Object> map){
        return map ;
    }

    @PostMapping("/second")
    public Map second(@RequestBody Map<String,Object> map){
        return map ;
    }

}
