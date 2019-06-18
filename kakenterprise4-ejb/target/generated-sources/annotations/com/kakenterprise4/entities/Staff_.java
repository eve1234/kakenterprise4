package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Address;
import com.kakenterprise4.entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Users> userid;
    public static volatile SingularAttribute<Staff, Integer> staffid;
    public static volatile SingularAttribute<Staff, Address> addressid;

}