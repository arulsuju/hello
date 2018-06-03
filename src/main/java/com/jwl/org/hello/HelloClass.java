package com.jwl.org.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {

    @Value("${properties.msg}")
    private String hellomsg;

    @Value("${app.description}")
    private String appinfo;

    @RequestMapping("/")
    public String Hello()
    {
        return hellomsg+""+appinfo;
    }
}
