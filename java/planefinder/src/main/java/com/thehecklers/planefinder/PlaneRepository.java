package com.thehecklers.planefinder;

import org.springframework.data.repository.CrudRepository;

public interface PlaneRepository extends ReactiveCrudRepository<Aircraft, Long> {
}
//The textbook shows this as a <Aircraft, String>