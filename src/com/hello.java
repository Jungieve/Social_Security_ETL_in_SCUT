package com;

import com.util.RunJobImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZihanCong on 16/3/31.
 */

@Controller
@RequestMapping(value = "/job")
public class hello {

    @ResponseBody
    @RequestMapping(method= RequestMethod.GET)
    public String ShowByContract()
    {

        System.out.println("Hello");
        RunJobImpl.runJob("C:\\kettle\\job\\ab02job.kjb");
        return "a";
    }
}
