package com.pragma.traceabilityservice.application.handler.impl;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.handler.ITrackingHandler;
import com.pragma.traceabilityservice.application.mapper.ITrackingDtoMapper;
import com.pragma.traceabilityservice.domain.api.ITrackingServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackingHandlerImpl implements ITrackingHandler {

    private final ITrackingServicePort trackingServicePort;
    private final ITrackingDtoMapper trackingDtoMapper;

    @Override
    public void trackingOrder(TrackingRequest trackingRequest) {
        trackingServicePort.trackingOrder(trackingDtoMapper.mapToTrackingModel(trackingRequest));
    }
}
