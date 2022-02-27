package com.mrgostepz.smoothspring.controller;

import java.util.List;

import com.mrgostepz.smoothspring.model.db.Staff;
import com.mrgostepz.smoothspring.db.repository.StaffRepository;
import com.mrgostepz.smoothspring.service.StaffService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/staff")
class StaffController {

    private static final Logger logger = LogManager.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @GetMapping(path="/{password}")
    public @ResponseBody List<Staff> getStaffByPassword(@PathVariable String password) {
        return staffService.getStaffByPassword(password);
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Staff getStaffById(@PathVariable int id) {
        return staffService.getAllStaffById(id);
    }

//    private final EmployeeRepository repository;
//
//    EmployeeController(EmployeeRepository repository) {
//        this.repository = repository;
//    }
//
//
//    // Aggregate root
//    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    String all() {
        return "1";
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

//        User n = new User();
//        n.setName(name);
//        n.setEmail(email);
//        userRepository.save(n);
        return "Saved";
    }


//    // end::get-aggregate-root[]
//
//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) {
//        return repository.save(newEmployee);
//    }
//
//    // Single item
//
//    @GetMapping("/employees/{id}")
//    Employee one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }
//
//    @PutMapping("/employees/{id}")
//    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }
//
//    @DeleteMapping("/employees/{id}")
//    void deleteEmployee(@PathVariable Long id) {
//        repository.deleteById(id);
//    }
}
