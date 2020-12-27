package com.shopping.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 25/12/2020
 */
@FeignClient(name = "SHOPPING-SERVICE",url = "http://localhost:8082/")
public interface ShoppingClient {

    @GetMapping("/api/items")
    public String[] getItems();
}
