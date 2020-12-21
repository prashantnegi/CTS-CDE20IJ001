package com.cts.training.mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subscriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sub_id")
    private Integer id;

    @Column(name = "sub_name")
    private String subscriptionName;

    @ManyToMany(mappedBy = "subscriptions")
    private Set<Subscriber> subscribers;
}
