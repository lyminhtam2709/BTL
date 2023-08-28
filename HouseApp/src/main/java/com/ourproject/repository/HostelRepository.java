/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.repository;

import com.ourproject.pojo.Hostel;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ahjhj
 */
@Repository
public interface HostelRepository {
    List<Hostel> getHostel();
    
    List<Hostel> getUnapprovedHostels();
    void approveHostel(int id);
}
