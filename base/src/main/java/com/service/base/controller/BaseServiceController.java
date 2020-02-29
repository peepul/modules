package com.service.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author peepul
 * @Date 2020/2/29 11:58
 */
@Controller
public class BaseServiceController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
     public String sayHello(){
        return "Hello, this is print in base-service.";
    }
}
