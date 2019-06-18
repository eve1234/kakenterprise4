package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Customer;
import com.kakenterprise4.entities.Staff;
import com.kakenterprise4.entities.Suppliers;
import com.kakenterprise4.entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> address2;
    public static volatile SingularAttribute<Address, String> address1;
    public static volatile SingularAttribute<Address, String> postcode;
    public static volatile ListAttribute<Address, Suppliers> suppliersList;
    public static volatile ListAttribute<Address, Customer> customerList;
    public static volatile ListAttribute<Address, Staff> staffList;
    public static volatile SingularAttribute<Address, Users> userid;
    public static volatile SingularAttribute<Address, Integer> addressid;

}