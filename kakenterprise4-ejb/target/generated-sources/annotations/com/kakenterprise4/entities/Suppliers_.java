package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Address;
import com.kakenterprise4.entities.Container;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Suppliers.class)
public class Suppliers_ { 

    public static volatile SingularAttribute<Suppliers, Integer> suppliersid;
    public static volatile ListAttribute<Suppliers, Container> containerList;
    public static volatile SingularAttribute<Suppliers, Address> addressid;

}