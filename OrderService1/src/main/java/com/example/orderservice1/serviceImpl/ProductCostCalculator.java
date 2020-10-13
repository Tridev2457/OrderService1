package com.example.orderservice1.serviceImpl;


import com.example.orderservice1.model.AppleProduct;
import com.example.orderservice1.model.Product;
import com.example.orderservice1.model.OrangeProduct;
import com.example.orderservice1.service.IProductCostCalculator;
import org.springframework.stereotype.Service;


@Service
public class ProductCostCalculator implements IProductCostCalculator {
    AppleProduct appleProduct;
    OrangeProduct orangeProduct;

    public ProductCostCalculator(Product appleProduct, Product orangeProduct) {
        this.appleProduct = new AppleProduct("Apple", 0.60);;
        this.orangeProduct = new OrangeProduct("Orange", 0.25);
    }

    public Double calculateProductCost(String[] items) {

        Double totalCost = 0.0;
        for (String item : items){
            if(item.equalsIgnoreCase(appleProduct.getItemName())){
                totalCost+= appleProduct.getItemPrice();
            }else if(item.equalsIgnoreCase(orangeProduct.getItemName())){
                totalCost+= orangeProduct.getItemPrice();
            }else{
                System.out.println("We sell only oranges and apples");
            }
        }


        return totalCost;
    }


}
