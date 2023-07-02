package com.geekster.Job.Search.Portal.service;

import com.geekster.Job.Search.Portal.model.Job;
import com.geekster.Job.Search.Portal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return (List<Job>) jobRepository.findAll();
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }
}
