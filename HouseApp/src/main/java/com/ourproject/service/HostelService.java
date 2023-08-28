/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.service;


import com.ourproject.pojo.Hostel;
import java.util.List;

/**
 *
 * @author ahjhj
 */
public interface HostelService {
    public List<Hostel> getHostel();
    
    public List<Hostel> getUnapprovedHostels();
    void approveHostel(int id);
}
