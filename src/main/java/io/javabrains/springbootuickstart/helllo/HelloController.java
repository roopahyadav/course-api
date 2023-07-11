package io.javabrains.springbootuickstart.helllo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/")
    //@RequestMapping("/hello")
    public String sayHi(){
        return "Welcome";
    }

    @GetMapping(path = "/user")
    //@RequestMapping("/hello")
    public String user(){
        return "Welcome User";
    }

    @GetMapping(path = "/admin")
    //@RequestMapping("/hello")
    public String admin(){
        return "Welcome Admin";
    }


}
