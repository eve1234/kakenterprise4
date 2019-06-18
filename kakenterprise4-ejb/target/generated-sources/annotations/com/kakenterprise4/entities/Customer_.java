package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Address;
import com.kakenterprise4.entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile SingularAttribute<Customer, Users> userid;
    public static volatile SingularAttribute<Customer, Address> addressid;

}