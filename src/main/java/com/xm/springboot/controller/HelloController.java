package com.xm.springboot.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


/**
 * @author xm
 * @create 2019/8/10-14:10
 */
@Controller
public class HelloController {



    @RequestMapping("/yes")

    public String success(Map<String,Object> map) {
        map.put("hello","<h1>你好<h1>");
        map.put("text1", Arrays.asList("aaa","bbb","ccc","小薛"));

        return "success";
    }
}
