package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehiclelicenseapp.licenseapplication.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application,Integer> {

}
