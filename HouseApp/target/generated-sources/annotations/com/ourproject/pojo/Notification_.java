package com.ourproject.pojo;

import com.ourproject.pojo.Follow;
import com.ourproject.pojo.Posting;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, Follow> followID;
    public static volatile SingularAttribute<Notification, Posting> postingID;
    public static volatile SingularAttribute<Notification, Date> createdDate;
    public static volatile SingularAttribute<Notification, Boolean> isRead;
    public static volatile SingularAttribute<Notification, Integer> notificationID;
    public static volatile SingularAttribute<Notification, String> content;

}