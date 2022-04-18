package com.adhi.booking.repository;

import com.adhi.booking.core.domain.Event;
import com.adhi.booking.core.domain.Ticket;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TicketRepo extends PagingAndSortingRepository<Ticket, Integer>, JpaSpecificationExecutor<Ticket> {

    List<Ticket> findByEvent(Event event);
}
