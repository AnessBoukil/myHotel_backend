package com.anessboukil.myhotel.repository;

import com.anessboukil.myhotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
