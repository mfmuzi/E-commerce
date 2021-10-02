package dio.ecommerce.checkout.service;


import dio.ecommerce.checkout.entity.CheckoutEntity;
import dio.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);



}
