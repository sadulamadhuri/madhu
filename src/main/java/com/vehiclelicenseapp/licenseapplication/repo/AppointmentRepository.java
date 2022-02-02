package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

}
