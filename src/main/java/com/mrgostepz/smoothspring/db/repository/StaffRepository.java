package com.mrgostepz.smoothspring.db.repository;

import com.mrgostepz.smoothspring.model.db.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer> {
    List<Staff> getStaffInfoByColumn(String columnName, String value);
    List<Staff> getStaffInfoByPassword(String password);
}
