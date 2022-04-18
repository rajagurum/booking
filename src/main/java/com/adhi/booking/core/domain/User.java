package com.adhi.booking.core.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    private Ticket Ticket;

    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;

}
