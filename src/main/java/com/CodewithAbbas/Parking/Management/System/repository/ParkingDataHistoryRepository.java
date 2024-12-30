package com.CodewithAbbas.Parking.Management.System.repository;

import com.CodewithAbbas.Parking.Management.System.entity.ParkingDataHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingDataHistoryRepository extends JpaRepository<ParkingDataHistory, Long> {
}
