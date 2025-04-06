package com.example.frequency_allocation_table.service;

import com.example.frequency_allocation_table.entity.FrequencyAllocation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FrequencyAllocationService {

    List<FrequencyAllocation> getAllFrequencies();

}
