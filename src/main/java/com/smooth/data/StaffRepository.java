package com.smooth.data;

import com.smooth.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    // SELECT * FROM Staff WHERE name = ?
//    @Query
    Optional<Staff> findStaffByName(String name);
}
