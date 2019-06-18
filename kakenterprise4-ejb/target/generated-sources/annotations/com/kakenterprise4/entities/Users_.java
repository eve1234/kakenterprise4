package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Address;
import com.kakenterprise4.entities.Customer;
import com.kakenterprise4.entities.Staff;
import com.kakenterprise4.entities.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> emailAddress;
    public static volatile ListAttribute<Users, Address> addressList;
    public static volatile SingularAttribute<Users, Integer> telephonenum;
    public static volatile ListAttribute<Users, Customer> customerList;
    public static volatile SingularAttribute<Users, UserRole> userRoleid;
    public static volatile ListAttribute<Users, Staff> staffList;
    public static volatile SingularAttribute<Users, Integer> userid;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, String> userpassword;

}