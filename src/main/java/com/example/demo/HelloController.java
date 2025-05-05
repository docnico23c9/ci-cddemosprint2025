package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
public String hello(){
    return  "Hola mundo desde Sprint Boot by Nicolas";
}
    @GetMapping("/hello2")
public String hello2(){
        return  "Hola mundo desde 2do metodo  second push Nicolas";
    }

}
