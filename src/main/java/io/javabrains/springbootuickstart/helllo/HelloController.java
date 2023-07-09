package io.javabrains.springbootuickstart.helllo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/hello")
    //@RequestMapping("/hello")
    public String sayHi(){
        return "Hi Roopa";
    }
}
