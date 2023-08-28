package com.ourproject.pojo;

import com.ourproject.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-28T20:48:57")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SingularAttribute<Role, Integer> roleID;
    public static volatile SingularAttribute<Role, String> roleName;
    public static volatile SetAttribute<Role, User> userSet;

}