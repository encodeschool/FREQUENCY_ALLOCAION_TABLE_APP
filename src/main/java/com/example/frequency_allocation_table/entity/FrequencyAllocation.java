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

    private String bandwidth;
    private String ituAllocationRegion1; // Maps to "ITU sadalījums radiosakaru dienestiem (veidiem) 1. reģiona"
    private String allocationLatvia; // Maps to "Sadalījums radiosakaru dienestiem (veidiem) Latvijā"
    private String radioSystemsLatvia; // Maps to "Iedalījums radiosakaru sistēmām Latvijā"
    private String internationalUsageInfo; // Maps to "Informācija par attiecību starptautiskajām radiofrekvenču spektra izmantotānas nosacījumiem attiecībā uz noteikumiem 4. pielikumam"
    private String additionalConditions; // Maps to "Papildu nosacījumi"
    private String efis;

    public FrequencyAllocation() {
    }

    public FrequencyAllocation(Long id, String bandwidth, String ituAllocationRegion1, String allocationLatvia, String radioSystemsLatvia, String internationalUsageInfo, String additionalConditions, String efis) {
        this.id = id;
        this.bandwidth = bandwidth;
        this.ituAllocationRegion1 = ituAllocationRegion1;
        this.allocationLatvia = allocationLatvia;
        this.radioSystemsLatvia = radioSystemsLatvia;
        this.internationalUsageInfo = internationalUsageInfo;
        this.additionalConditions = additionalConditions;
        this.efis = efis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getItuAllocationRegion1() {
        return ituAllocationRegion1;
    }

    public void setItuAllocationRegion1(String ituAllocationRegion1) {
        this.ituAllocationRegion1 = ituAllocationRegion1;
    }

    public String getAllocationLatvia() {
        return allocationLatvia;
    }

    public void setAllocationLatvia(String allocationLatvia) {
        this.allocationLatvia = allocationLatvia;
    }

    public String getRadioSystemsLatvia() {
        return radioSystemsLatvia;
    }

    public void setRadioSystemsLatvia(String radioSystemsLatvia) {
        this.radioSystemsLatvia = radioSystemsLatvia;
    }

    public String getInternationalUsageInfo() {
        return internationalUsageInfo;
    }

    public void setInternationalUsageInfo(String internationalUsageInfo) {
        this.internationalUsageInfo = internationalUsageInfo;
    }

    public String getAdditionalConditions() {
        return additionalConditions;
    }

    public void setAdditionalConditions(String additionalConditions) {
        this.additionalConditions = additionalConditions;
    }

    public String getEfis() {
        return efis;
    }

    public void setEfis(String efis) {
        this.efis = efis;
    }
}
