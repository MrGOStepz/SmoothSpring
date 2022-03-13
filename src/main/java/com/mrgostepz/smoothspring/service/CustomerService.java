package com.mrgostepz.smoothspring.service;

import com.mrgostepz.smoothspring.exception.RecordNotFoundException;
import com.mrgostepz.smoothspring.model.db.Staff;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private static final Logger logger = LogManager.getLogger(StaffService.class);

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff() {
        List<Staff> staffList = staffRepository.getAll();
        if (staffList == null) {
            throw new RecordNotFoundException("There is no record in staff table.");
        }
        logger.info(staffList);
        return staffRepository.getAll();
    }

    public Staff getAllStaffById(int id) {
        Staff staff = staffRepository.getById(id);
        if (staff == null) {
            throw new RecordNotFoundException("There is no staff in this id.");
        }
        logger.info("Staff {}", staff);
        return staff;
    }

    public Staff getStaffByPassword(String password) {
        List<Staff> staffList = staffRepository.getByPassword(password);
        if (staffList == null) {
            throw new RecordNotFoundException("There is no staff in this password.");
        }
        Staff staff = staffList.get(0);
        logger.info("Staff {}", staff);
        return staff;
    }

    public void addNewStaff(Staff staff) {
        int staffId = staffRepository.add(staff);
        staff.setId(staffId);
        if (staffId > 0) {
            logger.info("Add new staff Successfully: {}", staff);
        } else {
            logger.warn("Cannot add new staff: {}", staff);
            throw new RecordNotFoundException("Cannot Create");
        }
    }

    public void updateStaff(Staff staff) {
        if (Boolean.TRUE.equals(staffRepository.update(staff))) {
            logger.info("Update staff Successfully: {}", staff);
        } else {
            logger.warn("Cannot Update staff: {}", staff);
        }

    }

    public void deleteStaff(int id) {
        if (Boolean.TRUE.equals(staffRepository.deleteById(id))) {
            logger.info("Delete staff Successfully: {}", id);
        } else {
            logger.warn("Cannot Delete staff: {}", id);
        }
    }
}
