package com.amannur.myfirstjavaproject10mar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Aman";
    }

    @RequestMapping("/hello/{personName}")
    public String sayHelloToPerson(@PathVariable("personName") String personName) {
        return "Hello: " + personName;
    }
}

// http://url-of-my-server/hello
// http://url-of-my-server/hello/aman