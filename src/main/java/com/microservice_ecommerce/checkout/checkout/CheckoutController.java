package com.microservice_ecommerce.checkout.checkout;

import com.microservice_ecommerce.checkout.checkout.dto.CheckoutDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/checkout")
public class CheckoutController {

    protected CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping
    public void store(@Valid @RequestBody CheckoutDTO checkoutDTO) {
        checkoutService.checkout(checkoutDTO);
    }

}
