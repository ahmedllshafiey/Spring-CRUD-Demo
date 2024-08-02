package com.app.springcrud.repository;

import com.app.springcrud.Staff;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StaffCustomRepository {

    private final List<Staff> staffList = new ArrayList<>();

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList.clear();
        this.staffList.addAll(staffList);
    }

    public Staff getStaffByIndex(int index) {
        return staffList.get(index);
    }
}
