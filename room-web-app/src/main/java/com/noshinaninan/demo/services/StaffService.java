package com.noshinaninan.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.noshinaninan.demo.data.StaffRepository;
import com.noshinaninan.demo.models.StaffMember;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}