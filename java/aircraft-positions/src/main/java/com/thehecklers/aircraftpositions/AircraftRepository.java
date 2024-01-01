package com.thehecklers.aircraftpositions;

import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends ReactiveCrudRepository<Aircraft, Long> {}
