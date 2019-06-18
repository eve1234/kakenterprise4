package entities;

import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-02T19:30:39")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile ListAttribute<UserRole, Users> usersList;
    public static volatile SingularAttribute<UserRole, String> roleName;
    public static volatile SingularAttribute<UserRole, Integer> userRoleid;

}