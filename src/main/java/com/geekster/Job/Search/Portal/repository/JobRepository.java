package com.geekster.Job.Search.Portal.repository;

import com.geekster.Job.Search.Portal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
}
