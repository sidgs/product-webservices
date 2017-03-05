package com.sidgs.product.impl.jpa;

import com.sidgs.product.ProviderService;
import com.sidgs.product.error.ProductException;
import com.sidgs.product.model.Provider;
import com.sidgs.product.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    ProviderRepository providerRepository;

    public void add(Provider product) {
        providerRepository.save(product);
    }

    public List<Provider> getProvider() throws ProductException {
        List<Provider> providerList = new ArrayList<Provider>();
        Iterable<Provider> providers = providerRepository.findAll();
        return (List<Provider>) providers;

    }

    public Provider getProvider(long id) {
        return providerRepository.findOne(id);
    }

    public void remove(long providerId) {
        providerRepository.delete(providerId);
    }
}
