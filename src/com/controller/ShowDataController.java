package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZihanCong on 16/3/31.
 */

@Controller
@RequestMapping(value = "/job")
public class ShowDataController {

    @ResponseBody
    @RequestMapping(method= RequestMethod.GET)
    public String ShowByContract()
    {

        System.out.println("Hello");
        return "a";
    }
}
