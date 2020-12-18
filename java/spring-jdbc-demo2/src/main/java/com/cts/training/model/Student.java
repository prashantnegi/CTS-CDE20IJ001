package com.cts.training.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {

    private int id;
    private String name;
    private String email;
    private LocalDate joinDate;
}
