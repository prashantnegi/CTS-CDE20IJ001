package com.cts.training.mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trainers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trainer {

    @Id
    @Column(name = "trainee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "trainee_email")
    private String email;

    @Column(name = "trainee_fullname")
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "trainer")
    private Address address;
}
