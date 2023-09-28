package com.pragma.traceabilityservice.infraestructure.input.rest;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.handler.ITrackingHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracking")
@RequiredArgsConstructor
public class TrackingController {

    private final ITrackingHandler trackingHandler;

    @PostMapping
    public ResponseEntity<Void> trackingOrder(@Valid @RequestBody TrackingRequest trackingRequest){
        trackingHandler.trackingOrder(trackingRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
