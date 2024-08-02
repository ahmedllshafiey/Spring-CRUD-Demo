package com.app.springcrud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
public class Staff {
    @NotBlank(message = "Staff name cannot be blank")
    private String staffName;
    @NotBlank(message = "Staff position cannot be blank")
    private String staffPosition;
    @Min(value = 1000, message = "Staff salary must be greater than or equal to 1000")
    private double staffSalary;
    @Id
    private String id;

    public Staff(String staffName, String staffPosition, double staffSalary) {
        this.staffName = staffName;
        this.staffPosition = staffPosition;
        this.staffSalary = staffSalary;
        this.id = UUID.randomUUID().toString();
    }

    public Staff() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public double getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }
}