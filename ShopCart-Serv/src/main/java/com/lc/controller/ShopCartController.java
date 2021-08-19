package com.lc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 */
@RestController
public class ShopCartController {


    @GetMapping("/shopcart/remove")
    public String remove(Integer productId, Integer userId) {
        return "移出购物车成功";
    }

}
