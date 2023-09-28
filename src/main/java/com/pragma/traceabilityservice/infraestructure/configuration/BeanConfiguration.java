package com.pragma.traceabilityservice.infraestructure.configuration;

import com.pragma.traceabilityservice.domain.api.ITrackingServicePort;
import com.pragma.traceabilityservice.domain.spi.ITrackingPersistencePort;
import com.pragma.traceabilityservice.domain.usecase.TrackingUseCase;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.adapter.TrackingMongoAdapter;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.mapper.ITrackingCollectionMapper;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.repository.ITrackingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ITrackingPersistencePort trackingPersistencePort(ITrackingRepository trackingRepository, ITrackingCollectionMapper trackingCollectionMapper){
        return new TrackingMongoAdapter(trackingRepository, trackingCollectionMapper);
    }
    @Bean
    public ITrackingServicePort trackingServicePort(ITrackingPersistencePort trackingPersistencePort){
        return new TrackingUseCase(trackingPersistencePort);
    }
}
