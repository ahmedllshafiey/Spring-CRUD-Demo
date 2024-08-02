package com.app.springcrud.controller;

import com.app.springcrud.Constants;
import com.app.springcrud.Staff;
import com.app.springcrud.service.StaffService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;

        // Initialize the list with some entries
        staffService.getStaffList().add(new Staff("Ahmed", "Dev", 20000));
        staffService.getStaffList().add(new Staff("Ali", "QA", 15000));
        staffService.getStaffList().add(new Staff("Fahmy", "Manager", 25000));
        staffService.getStaffList().add(new Staff("Fares", "Accountant", 20000));
    }

    @GetMapping("/staff")
    public String getStaffDetails(Model model) {
        model.addAttribute("staffList", staffService.getStaffList());
        return "staff-details";
    }

    @GetMapping("/")
    public String addNewStaff(Model model, @RequestParam(required = false) String id) {
        Staff staff = new Staff();
        int index = getStaffIndex(id);

        model.addAttribute("add", index == Constants.NO_MATCH ? staff : staffService.getStaffByIndex(index));
        return "add-staff";
    }

    private int getStaffIndex(String id) {
        for (int i = 0; i < staffService.getStaffList().size(); i++) {
            if (staffService.getStaffList().get(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NO_MATCH;
    }

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(@Valid @ModelAttribute("add") Staff staff, BindingResult result) {

        if (result.hasErrors()) {
            return "add-staff";
        }

        int index = getStaffIndex(staff.getId());
        if (index == Constants.NO_MATCH) {
            staffService.addStaff(staff);
        } else {
            staffService.updateStaff(index, staff);
        }
        return "redirect:/staff";
    }
}
