package com.example.orderservice1.controller;


import com.example.orderservice1.serviceImpl.ProductCostCalculator;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductCostController {

    @Autowired
    ProductCostCalculator itemCostCalculator;


    @PostMapping("/v1/api/item/cost")
    public double calculateItemCost(@NotNull @RequestBody String[] itemsList){
        return itemCostCalculator.calculateProductCost(itemsList);
    }

}
