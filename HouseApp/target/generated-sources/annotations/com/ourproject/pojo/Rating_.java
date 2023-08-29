package com.ourproject.pojo;

import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, Date> createdDate;
    public static volatile SingularAttribute<Rating, Integer> ratingID;
    public static volatile SingularAttribute<Rating, Hostel> hostelID;
    public static volatile SingularAttribute<Rating, User> userID;
    public static volatile SingularAttribute<Rating, Float> point;

}