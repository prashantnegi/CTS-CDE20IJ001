package com.cts.training.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trainee_address")
public class Address {

    public Address(Integer id, String city, String state, String pinCode) {
        this.id = id;
        this.city = city;
        this.state= state;
        this.pinCode = pinCode;
    }

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String city;
    private String state;

    @Column(name = "pin_code")
    private String pinCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainee_id")
    private Trainee trainee;

}
