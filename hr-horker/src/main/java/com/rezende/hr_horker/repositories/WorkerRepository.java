package com.rezende.hr_horker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rezende.hr_horker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
