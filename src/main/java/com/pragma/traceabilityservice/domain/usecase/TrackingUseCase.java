package com.pragma.traceabilityservice.domain.usecase;

import com.pragma.traceabilityservice.domain.api.ITrackingServicePort;
import com.pragma.traceabilityservice.domain.exception.DataNotFoundException;
import com.pragma.traceabilityservice.domain.exception.DomainException;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.domain.spi.ITrackingPersistencePort;

import java.util.List;

public class TrackingUseCase implements ITrackingServicePort {

    private final ITrackingPersistencePort trackingPersistencePort;

    public TrackingUseCase(ITrackingPersistencePort trackingPersistencePort) {
        this.trackingPersistencePort = trackingPersistencePort;
    }

    @Override
    public void trackingOrder(TrackingModel trackingModel) {
        if(trackingModel.getStatus().equals(trackingModel.getStatusPrevious())) throw new DomainException("Both states must not be equal");
        trackingPersistencePort.trackingOrder(trackingModel);
    }

    @Override
    public List<TrackingModel> getHistoryOrder(Long orderId) {
        List<TrackingModel> trackingModelList = trackingPersistencePort.getHistoryOrder(orderId);
        if(trackingModelList.isEmpty()) throw new DataNotFoundException("the order don't have history");
        return trackingModelList;
    }
}
