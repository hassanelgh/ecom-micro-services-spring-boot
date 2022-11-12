package org.sid.customerservice.entities;

import org.sid.customerservice.entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types = Customer.class)
public interface ProjectionFullCustomer {
    public Long getId();
    public String getNom();
    public String getPrenom();
    public String getEmail();
}