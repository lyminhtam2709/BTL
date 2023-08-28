package com.ourproject.pojo;

import com.ourproject.pojo.Comment;
import com.ourproject.pojo.Image;
import com.ourproject.pojo.Notification;
import com.ourproject.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-28T20:48:57")
@StaticMetamodel(Posting.class)
public class Posting_ { 

    public static volatile SingularAttribute<Posting, Integer> postingID;
    public static volatile SingularAttribute<Posting, Date> createdDate;
    public static volatile SetAttribute<Posting, Notification> notificationSet;
    public static volatile SetAttribute<Posting, Image> imageSet;
    public static volatile SetAttribute<Posting, Comment> commentSet;
    public static volatile SingularAttribute<Posting, String> description;
    public static volatile SingularAttribute<Posting, String> title;
    public static volatile SingularAttribute<Posting, User> userID;

}