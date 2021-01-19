package com.smooth.service;

import com.smooth.data.StaffRepository;
import com.smooth.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getStaff() {
        return staffRepository.findAll();
    }


    public void addNewStaff(Staff staff) {
        Optional<Staff> staffByName = staffRepository.findStaffByName(staff.getName());

        if(staffByName.isPresent()) {
            throw new IllegalStateException("Name Taken");
        }

        staffRepository.save(staff);
    }

    public void deleteStaff(Long staffId) {
        if (staffRepository.existsById(staffId)) {
            throw  new IllegalStateException("Staff with Id " + staffId + "does not exists");
        }
        staffRepository.deleteById(staffId);
    }

    @Transactional
    public void updateStaff(Long staffId, String name, String mail) {
        Staff staff = staffRepository.findById(staffId).orElseThrow(() ->
                new IllegalStateException("Staff with Id " + staffId + "does not exist"));

        if (name.isEmpty() && !Objects.equals(staff.getName(), name)) {
            staff.setName(name);
        }

        if (mail.isEmpty() && !Objects.equals(staff.getEmail(), mail)) {
            Optional<Staff> staffOptional = staffRepository.findStaffByName(name);
            if (staffOptional.isPresent()) {
                throw new IllegalStateException("Name taken");
            }
            staff.setEmail(mail);
        }
    }
}
