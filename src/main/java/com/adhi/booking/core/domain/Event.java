package com.adhi.booking.core.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Event  implements Serializable {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer id;
    private String eventName;
    private String eventDesc;
    private LocalDate eventDate;
    private Integer totalTickets;

    @OneToMany(mappedBy="event")
    private Set<Ticket> ticket;

    @OneToMany(mappedBy="event")
    private Set<User> user;

}
