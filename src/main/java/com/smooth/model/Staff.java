package com.smooth.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Staff {
    @Id
    @SequenceGenerator(
            name = "staff_sequence",
            sequenceName = "staff_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "staff_sequence"
    )
    private Long id;
    private String name;
    private LocalDate bod;
    private String email;
    @Transient
    private Integer hour;

    public Integer getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bod=" + bod +
                ", email='" + email + '\'' +
                ", hour=" + hour +
                '}';
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }



    public Staff() {
    }

    public Staff(String name, LocalDate bod, String email) {
        this.name = name;
        this.bod = bod;
        this.email = email;
    }

    public Staff(Long id, String name, LocalDate bod, String email) {
        this.id = id;
        this.name = name;
        this.bod = bod;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBod() {
        return bod;
    }

    public void setBod(LocalDate bod) {
        this.bod = bod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
