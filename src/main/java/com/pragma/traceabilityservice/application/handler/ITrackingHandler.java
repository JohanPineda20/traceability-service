package com.pragma.traceabilityservice.application.handler;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.dto.response.TrackingResponse;

import java.util.List;

public interface ITrackingHandler {
    void trackingOrder(TrackingRequest trackingRequest);
    List<TrackingResponse> getHistoryOrder(Long orderId);
}
