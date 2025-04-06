package com.example.frequency_allocation_table.repository;

import com.example.frequency_allocation_table.entity.FrequencyAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequencyAllocationRepository extends JpaRepository<FrequencyAllocation, Long> {
}
