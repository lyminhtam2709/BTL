///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.ourproject.repository.impl;
//
//import com.ourproject.pojo.User;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//import org.springframework.context.annotation.Role;
//
///**
// *
// * @author ahjhj
// */
//public class UserRepositoryImpl {
//    private EntityManager entityManager;
//    
//    public User finByUserName(String userName){
//        TypedQuery<User> query = entityManager.createNamedQuery("User.findByUserName", User.class);
//        query.setParameter("userName", userName);
//        List<User> users = query.getResultList();
//        if(!users.isEmpty()){
//            return users.get(0);
//        }
//        return null;
//    }
//    
//    public User findByEmail(String email) {
//        TypedQuery<User> query = entityManager.createNamedQuery("User.findByEmail", User.class);
//        query.setParameter("email", email);
//        List<User> users = query.getResultList();
//        if (!users.isEmpty()) {
//            return users.get(0);
//        }
//        return null;
//    }
//    
//     public User findByRole(Role role) {
//        TypedQuery<User> query = entityManager.createNamedQuery("User.findByRole", User.class);
//        query.setParameter("role", role);
//        List<User> users = query.getResultList();
//        if (!users.isEmpty()) {
//            return users.get(0);
//        }
//        return null;
//    }
//}
