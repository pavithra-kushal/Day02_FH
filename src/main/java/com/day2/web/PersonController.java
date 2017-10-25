package com.day2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by pk4 on 10/25/17.
 */
@Controller
public class PersonController {

    @RequestMapping("/info")
   // @ResponseBody
    public String getInfo(Model model)
    {
        model.addAttribute("message", new Date().toString());
        return "information";
    }
}
