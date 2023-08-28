/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.service.impl;

import com.ourproject.pojo.Room;
import com.ourproject.repository.RoomRepository;
import com.ourproject.service.RoomService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahjhj
 */
@Service
public class RoomServiceImpl implements RoomService{
    
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getRooms() {
        return this.roomRepository.getRooms();
    }

    @Override
    public List<Room> getUnapprovedRooms() {
        return roomRepository.getUnapprovedRooms();
    }
    
    @Override
    public void approveRoom(int id) {
        roomRepository.approveRoom(id);
    }
    
}
