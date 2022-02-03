package com.noshinaninan.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noshinaninan.demo.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
