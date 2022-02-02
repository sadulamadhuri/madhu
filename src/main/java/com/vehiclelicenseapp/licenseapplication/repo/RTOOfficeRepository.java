package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.RTOOffice;

@Repository
public interface RTOOfficeRepository extends JpaRepository<RTOOffice,Integer> {

}
