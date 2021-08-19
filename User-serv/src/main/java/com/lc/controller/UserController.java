package com.lc.controller;

import org.omg.CORBA.INTERNAL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 */
@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public String getUserName(@PathVariable Integer userId) {
        return "子牙老师";
    }

}
