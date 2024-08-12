package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
