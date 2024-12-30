package com.CodewithAbbas.Parking.Management.System.dao;

import com.CodewithAbbas.Parking.Management.System.entity.ParkingSlot;
import org.springframework.data.jpa.domain.Specification;

public class ParkingSlotSpecification {

    public static Specification<ParkingSlot> availableParkingSlot() {
        return (parkingslot, cq, cb) -> cb.equal(parkingslot.get("carNumber"), "");
    }
}
