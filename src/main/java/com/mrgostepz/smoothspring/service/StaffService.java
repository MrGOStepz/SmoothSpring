package com.mrgostepz.smoothspring.service;

import com.mrgostepz.smoothspring.db.dao.StaffDAO;
import com.mrgostepz.smoothspring.model.db.Staff;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;

    public List<Staff> getAllStaff() {
        return staffRepository.getAll();
    }

    public Staff getAllStaffById(int id) {
        return staffRepository.getById(id);
    }

    public List<Staff> getStaffByPassword (String password) {
        return staffRepository.getByPassword(password);
    }

}
