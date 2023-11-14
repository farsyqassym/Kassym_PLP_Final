package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Staff;

import java.util.List;

public interface StaffService {
   public List<Staff> fetchStaffList();
   public Staff updateStaff(Long id, Staff staff);

   public Staff getStaffById(Long id);

  public void deleteById(Long id);
}
