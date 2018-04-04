package com.techolution.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Avinash on 26-12-2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    //@ResponseBody
    public String showLoginPage(ModelMap modelMap){

        return  "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //@ResponseBody
    public String showWelcomePage(ModelMap modelMap, @RequestParam String name){

        modelMap.put("name", name);

        return  "welcome";
    }
}
