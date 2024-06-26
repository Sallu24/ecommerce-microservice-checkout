package com.microservice_ecommerce.checkout.checkout;

import com.microservice_ecommerce.checkout.checkout.clients.CartClient;
import com.microservice_ecommerce.checkout.checkout.clients.OrderClient;
import com.microservice_ecommerce.checkout.checkout.dto.CheckoutDTO;
import com.microservice_ecommerce.checkout.checkout.dto.OrderDTO;
import com.microservice_ecommerce.checkout.checkout.external.Cart;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    protected CartClient cartClient;

    protected OrderClient orderClient;

    public CheckoutService(CartClient cartClient, OrderClient orderClient) {
        this.cartClient = cartClient;
        this.orderClient = orderClient;
    }

    public void checkout(CheckoutDTO checkoutDTO) {
        Cart userCart = fetchUserCart();
        createOrder(userCart, checkoutDTO);
    }

    private Cart fetchUserCart() {
        Cart userCart = cartClient.getUserCart();

        if (userCart != null) {
            System.out.println("cart items " + userCart.getCartItems());
            return userCart;
        }

        return null;
    }

    private void createOrder(Cart userCart, CheckoutDTO checkoutDTO) {

        OrderDTO orderDTO = new OrderDTO(userCart, checkoutDTO);

        orderClient.createOrder(orderDTO);
    }

}
