package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Staff;
import com.example.lastsmida.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/staffs")
    public List<Staff> fetchStaffList(){
        return staffService.fetchStaffList();
    }


    @GetMapping("/staffs/{id}")
    public Staff getStaffById(@PathVariable("id") Long id) {
        return staffService.getStaffById(id);
    }

    @PutMapping("/staffs/{id}")
    public Staff updateStaff(@PathVariable("id") Long id, @RequestBody Staff staff){
        return staffService.updateStaff(id, staff);
    }

    @DeleteMapping("/staffs/{id}")
    public String deleteById(@PathVariable("id") Long id){
        staffService.deleteById(id);
        return "staff deleted successfully!";
    }
}
