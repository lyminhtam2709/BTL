/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.service;

import com.ourproject.pojo.Hostel;
import com.ourproject.pojo.Room;
import java.util.List;

/**
 *
 * @author ahjhj
 */
public interface RoomService {
    List<Room> getRooms();
    
    public List<Room> getUnapprovedRooms();

    void approveRoom(int id);
}
