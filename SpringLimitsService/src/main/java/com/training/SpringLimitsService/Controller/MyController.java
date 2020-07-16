package com.training.SpringLimitsService.Controller;

import com.training.SpringLimitsService.Beans.LimitConfiguration;
import com.training.SpringLimitsService.Configuration.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public String getMessage(){
        return "welcome to microservice";
    }

    @GetMapping("/limits-config-dummy")
    public LimitConfiguration getConfig(){
        return new LimitConfiguration(1,999);
    }

    @Autowired
    MyConfiguration config;
    @GetMapping("/limits-config")
    public LimitConfiguration getConfigs(){
        return new LimitConfiguration(config.getMinimum(),config.getMaximum());
    }


}
