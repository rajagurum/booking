package com.adhi.booking.controller;

import com.adhi.booking.core.service.TicketService;
import com.adhi.booking.model.TicketDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "bookTicket")
@Slf4j
@AllArgsConstructor
public class TicketController {
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketDto> bookTicket(@RequestBody @Validated TicketDto ticketDto) {
        return ResponseEntity.ok(ticketService.createTicket(ticketDto));
    }

    @GetMapping
    public ResponseEntity<TicketDto> getTicket() {
        return ResponseEntity.ok(ticketService.getTicketById("1"));
    }
    @GetMapping("{id}")
    public ResponseEntity<TicketDto> getTicket(@PathVariable("id") String id) {
        return ResponseEntity.ok(ticketService.getTicketById(id));
    }

    @PatchMapping("{id}")
    public ResponseEntity<TicketDto> updateDepartment(@PathVariable("id") String id, @RequestBody @Validated TicketDto oldTicketDto) {
        return ResponseEntity.ok(ticketService.updateTicket(id, oldTicketDto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable("id") String id) {
        return ResponseEntity.ok(ticketService.deleteTicket(id));
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<TicketDto>> getTicketByEvent(@PathVariable("eventId") String eventId) {
        return ResponseEntity.ok(ticketService.getTicketByEvent(eventId));
    }
}
