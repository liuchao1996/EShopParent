package com.lc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 */
@RestController
public class ProductController {

    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable Integer productId) {
        return "IPHONE 12";
    }

}
