package com.microservice_ecommerce.checkout.checkout.dto;

import com.microservice_ecommerce.checkout.checkout.external.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Cart cart;

    private CheckoutDTO checkout;

}
