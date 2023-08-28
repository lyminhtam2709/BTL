/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.service.impl;

import com.ourproject.pojo.Hostel;
import com.ourproject.repository.HostelRepository;
import com.ourproject.service.HostelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahjhj
 */
@Service
public class HostelServiceImpl implements HostelService {

    @Autowired
    private HostelRepository hostelRepository;

    @Override
    public List<Hostel> getHostel() {
        return this.hostelRepository.getHostel();
    }

    @Override
    public List<Hostel> getUnapprovedHostels() {
        return hostelRepository.getUnapprovedHostels();
    }

    @Override
    public void approveHostel(int id) {
        hostelRepository.approveHostel(id);
    }
}
