package com.adhi.booking.repository;

import com.adhi.booking.core.domain.Ticket;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<Ticket, Integer>, JpaSpecificationExecutor<Ticket> {

}
