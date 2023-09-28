package com.pragma.traceabilityservice.application.handler;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;

public interface ITrackingHandler {
    void trackingOrder(TrackingRequest trackingRequest);
}
