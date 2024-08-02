package com.app.springcrud.service;

import com.app.springcrud.Staff;
import com.app.springcrud.repository.StaffCustomRepository;
import com.app.springcrud.interfaces.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffCustomRepository staffCustomRepo;
    private final StaffRepository staffRepo;

    @Autowired
    public StaffService(StaffCustomRepository staffCustomRepo, StaffRepository staffRepo) {
        this.staffCustomRepo = staffCustomRepo;
        this.staffRepo = staffRepo;
    }

    public List<Staff> getStaffList() {
        return staffCustomRepo.getStaffList();
    }

    public void setStaffList(List<Staff> staffList) {
        staffCustomRepo.setStaffList(staffList);
    }

    public Staff getStaffByIndex(int index) {
        return staffCustomRepo.getStaffByIndex(index);
    }

    public void addStaff(Staff staff) {
        staffCustomRepo.getStaffList().add(staff);
        staffRepo.save(staff);
    }

    public void updateStaff(int index, Staff staff) {
        staffCustomRepo.getStaffList().set(index, staff);
        staffRepo.save(staff);
    }
}
