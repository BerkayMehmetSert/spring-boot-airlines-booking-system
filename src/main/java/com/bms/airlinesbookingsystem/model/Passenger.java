package com.bms.airlinesbookingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(nullable = false, length = 32)
    private String firstName;

    @Column(nullable = false, length = 32)
    private String lastName;

    @Column(nullable = false, length = 64)
    private String address;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 16)
    private String nationality;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
    private List<ContactDetail> contactDetails;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
}
