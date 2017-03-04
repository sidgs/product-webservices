package com.sidgs.product;


import com.sidgs.product.error.ProductException;
import com.sidgs.product.model.Product;
import com.sidgs.product.model.Provider;

import java.util.List;

/**
 * Created by ayeluri on 1/15/2017.
 */
public interface ProviderService {

    void add(Provider product);
    List<Provider> getProvider() throws ProductException;
    Provider getProvider(long id);
    void remove(long providerId);
}
