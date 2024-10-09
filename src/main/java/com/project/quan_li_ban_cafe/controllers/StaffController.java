package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Staff;
import com.project.quan_li_ban_cafe.services.staffService.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private IStaffService staffService;

    @PostMapping("/add")
    public Staff add(@RequestBody Staff staff) {
        return staffService.createStaff(staff);
    }

    @PutMapping("/update/{id}")
    public Staff update(@PathVariable int id, @RequestBody Staff staff) {
        return staffService.updateStaff(id, staff);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return staffService.deleteStaff(id);
    }

    @GetMapping("/list")
    public List<Staff> list() {
        return staffService.getAllStaff();
    }

    @GetMapping("/onestaff")
    public List<Staff> onestaff() {
        return staffService.getAllStaff();
    }

}
