package com.adhi.booking.core.service.impl;

import com.adhi.booking.core.domain.Event;
import com.adhi.booking.core.domain.Ticket;
import com.adhi.booking.core.service.TicketService;
import com.adhi.booking.model.TicketDto;
import com.adhi.booking.repository.EventRepo;
import com.adhi.booking.repository.TicketRepo;
import com.adhi.booking.util.Validator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class TicketServiceImpl implements TicketService{

    @Autowired
    private Validator validator;
    @Autowired
    private EventRepo eventRepo;
    @Autowired
    private TicketRepo ticketRepo;


    private Integer remainingTickets = 50;
    List<TicketDto> bookings = new ArrayList<TicketDto>();

    public void bookTicket(TicketDto ticket) {

        CheckTicketBalance(ticket);
        bookings.add(ticket);
        ///go sendNotification(ticket)
        log.debug(" Booking accepted for \n", ticket.getEventId());
        log.debug(" RemainingTickets \n", remainingTickets);
    }

    private void CheckTicketBalance(TicketDto ticket){

        if ( remainingTickets == 0 ){
            log.debug("..... Booking Closed .....  ");
            log.debug("**** Please wait, until all notificaiton send to customer ****");
        } else {
            //String errorMessage = validator.isValideUser( ticket.getFirstName(), ticket.getLastName(), ticket.getEmail(), ticket.getNumberOfTickets(), remainingTickets);
            String errorMessage = "";
            if ( !errorMessage.isEmpty() ){
                log.debug("Ticket Validation failed");
            }
            remainingTickets = remainingTickets - ticket.getCount();
            log.debug("Bookings %v\n", bookings);
        }
    }

    @Override
    public TicketDto createTicket(TicketDto ticketDto) {
        Ticket ticketReq = Ticket.builder()
                .type(ticketDto.getType())
                .event(eventRepo.findById(Integer.valueOf(ticketDto.getEventId())).get())
                .build();
        Ticket ticketResp = ticketRepo.save(ticketReq);
        return TicketDto.builder()
                .id(ticketResp.getId())
                .type(ticketResp.getType())
                .eventId(ticketResp.getEvent().getId())
                .build();
    }

    @Override
    public TicketDto getTicketById(String id) {
        Ticket ticket = ticketRepo.findById(Integer.valueOf(id)).get();
        return TicketDto.builder()
                .id(ticket.getId())
                .type(ticket.getType())
                .eventId(ticket.getEvent().getId())
                .build();
    }

    @Override
    public TicketDto updateTicket(String id, TicketDto ticketDto) {
        Ticket ticketReq = Ticket.builder()
                .id(Integer.valueOf(id))
                .type(ticketDto.getType())
                .event(eventRepo.findById(Integer.valueOf(ticketDto.getEventId())).get())
                .build();
        Ticket ticketRes = ticketRepo.save(ticketReq);
        return TicketDto.builder()
                .id(ticketRes.getId())
                .type(ticketRes.getType())
                .eventId(ticketRes.getEvent().getId())
                .build();
    }

    @Override
    public String deleteTicket(String id) {
        ticketRepo.deleteById(Integer.valueOf(id));
        return "Success";
    }

    @Override
    public List<TicketDto> getAllTicket() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepo.findAll().forEach(tickets::add);
        return tickets.stream()
                .map(ticket -> TicketDto.builder()
                        .id(ticket.getId())
                        .type(ticket.getType())
                        .count(ticket.getCount())
                        .eventId(ticket.getEvent().getId())
                        .build()
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<TicketDto> getTicketByEvent(String eventId) {
        Event event = eventRepo.findById(Integer.valueOf(eventId)).get();
        List<Ticket> events = ticketRepo.findByEvent(event);
        return events.stream()
                .map(ticket -> TicketDto.builder()
                        .type(ticket.getType())
                        .id(ticket.getId())
                        .eventId(ticket.getEvent().getId())
                        .build()
                )
                .collect(Collectors.toList());
    }
}
