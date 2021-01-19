package com.smooth.config;

import com.smooth.data.StaffRepository;
import com.smooth.model.Staff;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StaffConfig {

    @Bean
    CommandLineRunner commandLineRunner(StaffRepository staffRepository) {
        return args -> {
            Staff a1 = new Staff(1L, "NAME", LocalDate.of(2020, 03, 28), "mail");
            Staff a2 = new Staff(2L, "NAME2", LocalDate.of(2020, 04, 28), "mail");

            staffRepository.saveAll(List.of(a1,a2));
        };
    }
}
