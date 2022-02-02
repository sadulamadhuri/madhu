package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.RTOOfficer;

@Repository
public interface RTOOfficerRepository extends JpaRepository<RTOOfficer,Integer>{

}
