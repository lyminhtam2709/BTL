package com.ourproject.pojo;

import com.ourproject.pojo.Comment;
import com.ourproject.pojo.Follow;
import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.Posting;
import com.ourproject.pojo.Rating;
import com.ourproject.pojo.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Posting> postingSet;
    public static volatile SetAttribute<User, Comment> commentSet;
    public static volatile SingularAttribute<User, Role> roleID;
    public static volatile SetAttribute<User, Follow> followSet;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SetAttribute<User, Rating> ratingSet;
    public static volatile SetAttribute<User, Hostel> hostelSet;
    public static volatile SingularAttribute<User, Integer> userID;
    public static volatile SetAttribute<User, Follow> followSet1;
    public static volatile SingularAttribute<User, String> email;

}