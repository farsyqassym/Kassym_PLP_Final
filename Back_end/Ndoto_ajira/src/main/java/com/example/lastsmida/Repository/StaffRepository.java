package com.example.lastsmida.Repository;

import com.example.lastsmida.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
   public Optional<Staff> findByUserName(String userName);
}
