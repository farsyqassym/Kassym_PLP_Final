package com.example.lastsmida.Service;

import com.example.lastsmida.Exception.ApiException;
import com.example.lastsmida.Model.Staff;
import com.example.lastsmida.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Staff> fetchStaffList() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaffById(Long id) {
        return staffRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Staff updateStaff(Long id, Staff staff) {

        Staff staffDb = staffRepository.findById(id).get();
//                .orElseThrow(() -> new ApiException("User not found"));

        if (Objects.nonNull(staff.getUserFirstName())&&
        !"".equalsIgnoreCase(staff.getUserName())){
            staffDb.setUserFirstName(staff.getUserFirstName());
        }

        if (Objects.nonNull(staff.getUserMiddleName())&&
        !"".equalsIgnoreCase(staff.getUserMiddleName())){
            staffDb.setUserMiddleName(staff.getUserMiddleName());
        }

        if (Objects.nonNull(staff.getUserLastName())&&
        !"".equalsIgnoreCase(staff.getUserLastName())){
            staffDb.setUserLastName(staff.getUserLastName());
        }

        if (Objects.nonNull(staff.getUserEmail())&&
        !"".equalsIgnoreCase(staff.getUserEmail())){
            staffDb.setUserEmail(staff.getUserEmail());
        }

        if (Objects.nonNull(staff.getUserPhone())&&
        !"".equalsIgnoreCase(staff.getUserPhone())){
            staffDb.setUserPhone(staff.getUserPhone());
        }

        if (Objects.nonNull(staff.getAddress())&&
        !"".equalsIgnoreCase(staff.getAddress())){
            staffDb.setAddress(staff.getAddress());
        }

        if (Objects.nonNull(staff.getUserName())&&
        !"".equalsIgnoreCase(staff.getUserName())){
            staffDb.setUserName(staff.getUserName());
        }


        return staffRepository.save(staffDb);
    }




}
