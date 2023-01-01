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
public class Route {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(nullable = false, length = 32)
    private String airport;

    @Column(nullable = false, length = 32)
    private String destination;

    @Column(nullable = false, unique = true)
    private String routeCode;

    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    private List<AirFare> airFares;
}
