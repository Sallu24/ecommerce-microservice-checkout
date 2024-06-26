package com.microservice_ecommerce.checkout.checkout.clients;

import com.microservice_ecommerce.checkout.checkout.external.Cart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CART")
public interface CartClient {

    @GetMapping("/api/cart/internal")
    Cart getUserCart();

}
