package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Staff;
import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Model.User;
import com.example.lastsmida.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUsers() {
        userService.initRoleAndUser();
    }

    @PostMapping("/registerNewApplicant")
    public Applicant registerNewUser(@RequestBody Applicant applicant){
        return userService.registerNewApplicant(applicant);
    }

    //register staff ******************************************
    @PostMapping("/registerNewStaff")
    public Staff registerNewStaffs(@RequestBody Staff staff){
        return userService.registerNewStaff(staff);
    }

    @GetMapping("/users")
    public List<User> fetchAllUser(){
        return userService.fetchAllUser();
    }



}


