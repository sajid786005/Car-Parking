package com.CodewithAbbas.Parking.Management.System.repository;

import com.CodewithAbbas.Parking.Management.System.entity.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlotRepository  extends JpaRepository<ParkingSlot, Long>, JpaSpecificationExecutor<ParkingSlot> {
}
