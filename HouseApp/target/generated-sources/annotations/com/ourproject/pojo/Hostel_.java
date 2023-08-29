package com.ourproject.pojo;

import com.ourproject.pojo.Rating;
import com.ourproject.pojo.Room;
import com.ourproject.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-29T14:52:26")
@StaticMetamodel(Hostel.class)
public class Hostel_ { 

    public static volatile SingularAttribute<Hostel, Boolean> approved;
    public static volatile SingularAttribute<Hostel, String> address;
    public static volatile SingularAttribute<Hostel, String> phone;
    public static volatile SingularAttribute<Hostel, Integer> hostelID;
    public static volatile SingularAttribute<Hostel, String> name;
    public static volatile SetAttribute<Hostel, Room> roomSet;
    public static volatile SetAttribute<Hostel, Rating> ratingSet;
    public static volatile SingularAttribute<Hostel, User> userID;

}