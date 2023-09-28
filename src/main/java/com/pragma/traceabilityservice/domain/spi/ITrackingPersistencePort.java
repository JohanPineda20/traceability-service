package com.pragma.traceabilityservice.domain.spi;

import com.pragma.traceabilityservice.domain.model.TrackingModel;

public interface ITrackingPersistencePort {
    void trackingOrder(TrackingModel trackingModel);
}
