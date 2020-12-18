package com.cts.training.eih;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "insurance_details")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "ins_type")
public  class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String policyHolder;
    private String email;
    private String policyName;
    private Float insuredAmount;

}
