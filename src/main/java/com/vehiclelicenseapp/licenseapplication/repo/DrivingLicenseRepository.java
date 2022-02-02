package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.DrivingLicense;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense,Integer> {

}
