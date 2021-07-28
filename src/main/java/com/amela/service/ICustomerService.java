package com.amela.service;

import com.amela.model.Customer;
import com.amela.model.Province;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
