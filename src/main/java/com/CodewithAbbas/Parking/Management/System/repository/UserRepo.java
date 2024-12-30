package com.CodewithAbbas.Parking.Management.System.repository;

import com.CodewithAbbas.Parking.Management.System.Model.UserRegistration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<UserRegistration, String> {

    public UserRegistration findByEmailAndPassword(String email,String password);

    List<UserRegistration> findAll();
}
