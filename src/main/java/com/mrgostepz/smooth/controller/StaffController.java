package com.mrgostepz.smooth.controller;

import java.util.List;

import com.mrgostepz.smooth.model.db.Staff;
import com.mrgostepz.smooth.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//https://mkyong.com/spring-boot/spring-rest-error-handling-example/
//http://localhost:8080/spring-mvc-basics/foos?id=abc
// @RequestParam means it is a parameter from the GET or POST request

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/staff")
class StaffController {

    private static final Logger logger = LogManager.getLogger(StaffController.class);

    private final StaffService staffService;

    @GetMapping(path = "/all")
    @ResponseBody
    public ResponseEntity<List<Staff>> getAllStaff() {
        return new ResponseEntity<>(staffService.getAllStaff(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Staff> getStaffById(@PathVariable int id) {
        Staff staff = staffService.getStaffById(id);
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @GetMapping(path = "/")
    @ResponseBody
    public ResponseEntity<List<Staff>> getStaffById(@RequestParam String columnName, @RequestParam String value) {
        List<Staff> staffList = staffService.getStaffByColumn(columnName, value);
        return new ResponseEntity<>(staffList, HttpStatus.OK);

    }

    @PostMapping(path = "/password")
    @ResponseBody
    public ResponseEntity<Staff> getStaffByPassword(String password) {
        Staff staff = staffService.getStaffByPassword(password);
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public ResponseEntity<String> addNewStaff(@RequestBody Staff staff) {
        staffService.addStaff(staff);
        return new ResponseEntity<>(String.format("Add new staff successfully: %s", staff.toString()), HttpStatus.CREATED);

    }


    @PutMapping(path = "/update")
    public String updateStaff(@RequestBody Staff staff) {
        staffService.updateStaff(staff);
        return String.format("Update Staff: %s completed.", staff);

    }

    @DeleteMapping("/{id}")
    public String deleteStaff(@PathVariable int id) {
        staffService.deleteStaff(id);
        return String.format("Delete Staff Id: %d completed.", id);

    }
}
