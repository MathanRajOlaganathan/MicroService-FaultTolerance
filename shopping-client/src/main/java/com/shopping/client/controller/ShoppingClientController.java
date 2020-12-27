package com.shopping.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shopping.client.api.ShoppingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 25/12/2020
 */
@RestController
@RequestMapping("/shopping")
public class ShoppingClientController {

    @Autowired
    private ShoppingClient  shoppingClient;

    @GetMapping("/items")
    @HystrixCommand(fallbackMethod = "getItemsFallback")
    public String[] getItems(){
    return shoppingClient.getItems();
    }

    public  String[] getItemsFallback(){

        return new String[]{"Shopping Service is down. Circuit Breaker is enabled. Please return after sometime"};

    }

}
