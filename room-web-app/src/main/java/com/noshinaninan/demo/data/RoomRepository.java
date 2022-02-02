package com.noshinaninan.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noshinaninan.demo.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

