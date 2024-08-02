package com.app.springcrud.interfaces;

import com.app.springcrud.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {

}
