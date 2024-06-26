package com.microservice_ecommerce.checkout.checkout.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BillingDTO {

    private String first_name;

    private String last_name;

    private String address;

    private String city;

    private String zip;

    private String state;

    private String country;

}
