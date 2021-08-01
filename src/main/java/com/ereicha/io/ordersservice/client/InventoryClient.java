package com.ereicha.io.ordersservice.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface InventoryClient {
    @GetMapping("/api/inventory/{skuCode}")
    Boolean checkStock(@PathVariable String skuCode);
}
