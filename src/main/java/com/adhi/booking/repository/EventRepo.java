package com.adhi.booking.repository;

import com.adhi.booking.core.domain.Event;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepo extends PagingAndSortingRepository<Event, Integer>, JpaSpecificationExecutor<Event> {

}
