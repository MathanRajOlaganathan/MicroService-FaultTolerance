package com.shopping.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 25/12/2020
 */
@RestController
@RequestMapping("/api")
public class ShoppingServiceController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/items")
    public List<String> getItems(){
        return Stream.of("electronics","clothes","groceries","chocolates",port).collect(Collectors.toList());
    }
}
