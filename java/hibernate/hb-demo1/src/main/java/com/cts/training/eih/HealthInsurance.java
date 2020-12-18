package com.cts.training.eih;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "health_insurance_details")
//@DiscriminatorValue("Health")
public class HealthInsurance extends Insurance{

    @Column(name = "terminal_covered")
    private boolean isTerminalCovered;

    @Column(name = "maternity_covered")
    private boolean isMaternityCovered;

}
