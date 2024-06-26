package com.microservice_ecommerce.checkout.checkout.clients;

import com.microservice_ecommerce.checkout.checkout.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ORDER")
public interface OrderClient {

    @PostMapping("/api/orders/internal")
    void createOrder(@RequestBody OrderDTO orderDTO);

}
