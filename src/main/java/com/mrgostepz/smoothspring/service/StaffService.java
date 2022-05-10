package com.mrgostepz.smoothspring.service;

import com.mrgostepz.smoothspring.exception.InsertRecordException;
import com.mrgostepz.smoothspring.exception.RecordNotFoundException;
import com.mrgostepz.smoothspring.model.db.Staff;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffService {
    private static final Logger logger = LogManager.getLogger(StaffService.class);

    private final StaffRepository staffRepository;

    public List<Staff> getAllStaff() {
        List<Staff> staffList = staffRepository.getAll();
        if (staffList == null) {
            throw new RecordNotFoundException("There is no record in staff table.");
        }
        logger.info(staffList);
        return staffRepository.getAll();
    }

    public Staff getStaffById(int id) {
        Staff staff = staffRepository.getById(id);
        if (staff == null) {
            throw new RecordNotFoundException("There is no staff in this id.");
        }
        logger.info("Staff {}", staff);
        return staff;
    }

    public Staff getStaffByPassword(String password) {
        List<Staff> staffList = staffRepository.getStaffInfoByPassword(password);
        if (staffList == null) {
            throw new RecordNotFoundException("There is no staff in this password.");
        }
        Staff staff = staffList.get(0);
        logger.info("Staff {}", staff);
        return staff;
    }

    public void addStaff(Staff staff) {
        int staffId = staffRepository.add(staff);
        staff.setId(staffId);
        if (staffId > 0) {
            logger.info("Add new staff Successfully: {}", staff);
        } else {
            logger.warn("Cannot add new staff: {}", staff);
            throw new InsertRecordException("Cannot Create");
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

    public List<Staff> getStaffByColumn(String column, String value) {
        List<Staff> staffList = staffRepository.getStaffInfoByColumn(column, value);
        if (staffList == null) {
            throw new RecordNotFoundException("There is no staff in this column.");
        }
        Staff staff = staffList.get(0);
        logger.info("Staff {}", staff);
        return staffList;
    }
}
