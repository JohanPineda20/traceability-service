package com.pragma.traceabilityservice.domain.api;

import com.pragma.traceabilityservice.domain.model.TrackingModel;

import java.util.List;

public interface ITrackingServicePort {
    void trackingOrder(TrackingModel trackingModel);
    List<TrackingModel> getHistoryOrder(Long orderId);
}
