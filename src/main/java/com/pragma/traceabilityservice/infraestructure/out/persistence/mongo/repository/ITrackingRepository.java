package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.repository;

import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.collection.TrackingCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITrackingRepository extends MongoRepository<TrackingCollection,String> {
    List<TrackingCollection> findByOrderId(Long orderId);
}
