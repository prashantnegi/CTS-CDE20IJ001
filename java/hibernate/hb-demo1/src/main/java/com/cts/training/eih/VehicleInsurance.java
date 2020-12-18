package com.cts.training.eih;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "vehicle_insurance_details")
//@DiscriminatorValue("Vehicle")
public class VehicleInsurance extends Insurance {

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "reg_no")
    private String regNumber;
}
