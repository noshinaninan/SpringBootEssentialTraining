package com.noshinaninan.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.noshinaninan.demo.data.RoomRepository;
import com.noshinaninan.demo.models.Room;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}