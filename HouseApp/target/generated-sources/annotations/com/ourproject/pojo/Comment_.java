package com.ourproject.pojo;

import com.ourproject.pojo.Posting;
import com.ourproject.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Posting> postingID;
    public static volatile SingularAttribute<Comment, Date> createdDate;
    public static volatile SingularAttribute<Comment, Integer> commentID;
    public static volatile SingularAttribute<Comment, String> description;
    public static volatile SingularAttribute<Comment, User> userID;

}