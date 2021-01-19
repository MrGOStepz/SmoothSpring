package com.smooth.controller;

import com.smooth.model.Staff;
import com.smooth.service.StaffService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.message.*;
import org.apache.logging.log4j.Logger;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/staff")
public class StaffController {

    private static final Logger logger = LogManager.getLogger(StaffController.class);

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getStaff(){
        logger.info("test");
        return staffService.getStaff();
    }

    @PostMapping()
    public void addNewStaff(@RequestBody Staff staff) {
        staffService.addNewStaff(staff);
    }

    @DeleteMapping(path = "{staffId}")
    public void deleteStaff(@PathVariable("staffId") Long staffId ) {
        staffService.deleteStaff(staffId);
    }

    @PutMapping(path = "{staffId}")
    public void updateStaff(@PathVariable("staffId") Long staffId, @RequestParam(required = false) String name, @RequestParam(required = false) String mail) {
        staffService.updateStaff(staffId,name,mail);
    }
}
