package com.adhi.booking.core.service;

import com.adhi.booking.model.TicketDto;

import java.util.List;


public interface TicketService {

    void bookTicket(TicketDto ticket);
    public TicketDto createTicket(TicketDto ticketDto);

    TicketDto getTicketById(String id);

    TicketDto updateTicket(String id, TicketDto ticketDto);

    String deleteTicket(String id);

    List<TicketDto> getAllTicket();

    List<TicketDto> getTicketByEvent(String eventId);
}
