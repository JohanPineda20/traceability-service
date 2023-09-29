package com.pragma.traceabilityservice.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class TrackingResponse {
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDateTime datetime;
    private String statusPrevious;
    private String status;
    private Long employeeId;
    private String employeeEmail;
}
