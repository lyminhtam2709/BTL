package com.ourproject.pojo;

import com.ourproject.pojo.Notification;
import com.ourproject.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(Follow.class)
public class Follow_ { 

    public static volatile SingularAttribute<Follow, Integer> followID;
    public static volatile SetAttribute<Follow, Notification> notificationSet;
    public static volatile SingularAttribute<Follow, User> followerUserID;
    public static volatile SingularAttribute<Follow, User> followedUserID;

}