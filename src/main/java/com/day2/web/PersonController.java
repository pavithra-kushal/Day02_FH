package com.day2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pk4 on 10/25/17.
 */
@Controller
public class PersonController {

    @RequestMapping("/info")
   // @ResponseBody
    public String getInfo()
    {
        return "information";
    }
}
