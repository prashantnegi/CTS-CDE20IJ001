package com.cts.training.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Customer {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private LocalDate date;
}
