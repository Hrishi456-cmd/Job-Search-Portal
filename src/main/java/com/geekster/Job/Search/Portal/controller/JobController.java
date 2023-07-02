package com.geekster.Job.Search.Portal.controller;

import com.geekster.Job.Search.Portal.model.Job;
import com.geekster.Job.Search.Portal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jobs")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        List<Job> jobs = jobService.getAllJobs();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Job> createJob(@Valid @RequestBody Job job) {
        Job createdJob = jobService.createJob(job);
        return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
    }
}
