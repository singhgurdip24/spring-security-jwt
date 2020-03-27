package com.codesingh.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

    @RequestMapping({ "/hello"  })
    public String hello(){
        return "Welcome to Spring Security";
    }
}
