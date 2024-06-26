package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.adapter;


import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.domain.spi.ITrackingPersistencePort;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.mapper.ITrackingCollectionMapper;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.repository.ITrackingRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TrackingMongoAdapter implements ITrackingPersistencePort {

    private final ITrackingRepository trackingRepository;
    private final ITrackingCollectionMapper trackingCollectionMapper;

    @Override
    public void trackingOrder(TrackingModel trackingModel) {
        trackingRepository.save(trackingCollectionMapper.mapToTrackingCollection(trackingModel));
    }

    @Override
    public List<TrackingModel> getHistoryOrder(Long orderId) {
        return trackingCollectionMapper.mapToTrackingModelList(trackingRepository.findByOrderId(orderId));
    }
}
