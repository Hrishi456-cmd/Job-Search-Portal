package com.geekster.Job.Search.Portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 100)
    private String title;
    @NotNull
    @Size(min = 1, max = 500)
    private String description;
    @NotNull
    @Size(min = 1, max = 100)
    private String location;
    @NotNull
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    @NotNull
    @Email
    private String companyEmail;
    @NotNull
    @Size(min = 1, max = 100)
    private String companyName;
    @NotNull
    @Size(min = 1, max = 100)
    private String employerName;
    @NotNull
    @Enumerated
    private JobType jobType;
//    @NotNull
//    private LocalDate appliedDate;

}
