package com.adhi.booking.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Jacksonized
public class EventDto  implements Serializable {
    private Integer id;
    private String eventName;
    private String eventDescription;
    private Integer totalTickets;
    private Integer ticketsSold;
}
