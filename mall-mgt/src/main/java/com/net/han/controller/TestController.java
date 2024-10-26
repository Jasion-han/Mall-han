package com.net.han.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController @Description  
 *
 * @author han @Date 2024/10/25 18:28 @Version 1.0
 */

@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
