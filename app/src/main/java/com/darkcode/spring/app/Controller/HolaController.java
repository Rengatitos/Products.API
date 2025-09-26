package com.darkcode.spring.app.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController{
    @GetMapping("/")
    String hola(){
    return "Hola mundo con DarkCode";
    }
}