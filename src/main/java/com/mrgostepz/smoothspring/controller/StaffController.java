package com.mrgostepz.smoothspring.controller;

import java.util.List;

import com.mrgostepz.smoothspring.exception.RecordNotFoundException;
import com.mrgostepz.smoothspring.model.db.Staff;
import com.mrgostepz.smoothspring.service.StaffService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//https://mkyong.com/spring-boot/spring-rest-error-handling-example/

@RestController
@RequestMapping(path = "/staff")
class StaffController {

    private static final Logger logger = LogManager.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;

    @GetMapping(path = "/all")
    @ResponseBody
    public ResponseEntity<List<Staff>> getAllStaff() {
        try {
            List<Staff> staff = staffService.getAllStaff();
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } catch (RecordNotFoundException ex) {
            throw ex;
        } catch (DataAccessException ex) {
            throw ex;
        } catch (Exception ex) {
            throw ex;
        }
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Staff> getStaffById(@PathVariable int id) {
        try {
            Staff staff = staffService.getAllStaffById(id);
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } catch (RecordNotFoundException ex) {
            throw ex;
        }
    }

    @PostMapping(path = "/password")
    @ResponseBody
    public ResponseEntity<Staff> getStaffByPassword(String password) {
        try {
            Staff staff = staffService.getStaffByPassword(password);
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } catch (RecordNotFoundException ex) {
            throw ex;
        }
    }

    //http://localhost:8080/spring-mvc-basics/foos?id=abc
    // @RequestParam means it is a parameter from the GET or POST request

    @PostMapping(path = "/add")
    @ResponseBody
    public ResponseEntity<String> addNewStaff(@RequestBody Staff staff) {
        try {
            staffService.addNewStaff(staff);
            return new ResponseEntity<>(String.format("Add new staff successfully: %s" , staff.toString()), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @PutMapping(path = "/update")
    public String updateStaff(@RequestBody Staff staff) {
        try {
            staffService.updateStaff(staff);
            return String.format("Update Staff: %s completed.", staff);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @DeleteMapping("/{id}")
    public String deleteStaff(@PathVariable int id) {
        try {
            staffService.deleteStaff(id);
            return String.format("Delete Staff Id: %d completed.", id);
        } catch (Exception ex) {
            throw ex;
        }
    }


}
