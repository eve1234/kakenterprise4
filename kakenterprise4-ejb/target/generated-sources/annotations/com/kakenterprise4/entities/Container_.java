package com.kakenterprise4.entities;

import com.kakenterprise4.entities.Bales;
import com.kakenterprise4.entities.Suppliers;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T01:13:50")
@StaticMetamodel(Container.class)
public class Container_ { 

    public static volatile SingularAttribute<Container, Suppliers> suppliersid;
    public static volatile SingularAttribute<Container, Double> cost;
    public static volatile SingularAttribute<Container, Integer> totalBales;
    public static volatile SingularAttribute<Container, Integer> containerid;
    public static volatile ListAttribute<Container, Bales> balesList;

}