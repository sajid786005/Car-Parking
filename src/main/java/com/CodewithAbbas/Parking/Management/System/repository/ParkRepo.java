package com.CodewithAbbas.Parking.Management.System.repository;

import com.CodewithAbbas.Parking.Management.System.Model.ParkingRegistration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParkRepo extends CrudRepository<ParkingRegistration, Integer> {

    public ParkingRegistration findBySlotBook(String slotBook);

    public List<ParkingRegistration> findByUser(String user);

    List<ParkingRegistration> findAll();
}
