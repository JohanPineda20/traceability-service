package com.pragma.traceabilityservice.domain.api;

import com.pragma.traceabilityservice.domain.model.TrackingModel;

public interface ITrackingServicePort {
    void trackingOrder(TrackingModel trackingModel);
}
