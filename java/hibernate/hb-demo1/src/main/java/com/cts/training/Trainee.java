package com.cts.training;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "trainees")
public class Trainee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "emp_name")
    private String empName;

    private String email;

    @Column(name = "service_line")
    private String serviceLine;

    @Column(name = "cohort_code")
    private String cohort;

    @Column(name = "join_date")
    private LocalDate joinDate;
}
