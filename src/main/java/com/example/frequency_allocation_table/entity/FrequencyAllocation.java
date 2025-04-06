package com.example.frequency_allocation_table.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FrequencyAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String ituAllocationRegion1; // Maps to "ITU sadalījums radiosakaru dienestiem (veidiem) 1. reģiona"
    private String allocationLatvia; // Maps to "Sadalījums radiosakaru dienestiem (veidiem) Latvijā"
    private String radioSystemsLatvia; // Maps to "Iedalījums radiosakaru sistēmām Latvijā"
    private String internationalUsageInfo; // Maps to "Informācija par attiecību starptautiskajām radiofrekvenču spektra izmantotānas nosacījumiem attiecībā uz noteikumiem 4. pielikumam"
    private String additionalConditions; // Maps to "Papildu nosacījumi"

}
