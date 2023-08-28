/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ourproject.repository;

import com.ourproject.pojo.Room;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ahjhj
 */
@Repository
public interface RoomRepository {
    public List<Room> getRooms();
    
    public List<Room> getUnapprovedRooms() ; 
    public void approveRoom(int id);
}
