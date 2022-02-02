package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.Challan;

@Repository
public interface ChallanRepository extends JpaRepository<Challan,Integer>{

}
