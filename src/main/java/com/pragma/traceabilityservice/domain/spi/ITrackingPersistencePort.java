package com.pragma.traceabilityservice.domain.spi;

import com.pragma.traceabilityservice.domain.model.TrackingModel;

import java.util.List;

public interface ITrackingPersistencePort {
    void trackingOrder(TrackingModel trackingModel);
    List<TrackingModel> getHistoryOrder(Long orderId);
}
