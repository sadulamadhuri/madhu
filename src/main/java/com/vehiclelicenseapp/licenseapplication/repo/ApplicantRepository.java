package com.vehiclelicenseapp.licenseapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehiclelicenseapp.licenseapplication.entity.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {

}
