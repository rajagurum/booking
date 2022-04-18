package com.adhi.booking.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ticket  implements Serializable {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer id;
    private String type;
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;

}
