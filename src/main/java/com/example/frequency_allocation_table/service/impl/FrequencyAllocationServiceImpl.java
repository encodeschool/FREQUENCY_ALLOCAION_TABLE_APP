package com.example.frequency_allocation_table.service.impl;

import com.example.frequency_allocation_table.entity.FrequencyAllocation;
import com.example.frequency_allocation_table.repository.FrequencyAllocationRepository;
import com.example.frequency_allocation_table.service.FrequencyAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrequencyAllocationServiceImpl implements FrequencyAllocationService {

    @Autowired
    private FrequencyAllocationRepository frequencyAllocationRepository;

    @Override
    public List<FrequencyAllocation> getAllFrequencies() {
        return frequencyAllocationRepository.findAll();
    }
}
