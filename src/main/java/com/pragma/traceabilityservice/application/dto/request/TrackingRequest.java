package com.pragma.traceabilityservice.application.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TrackingRequest {

    @NotNull(message = "order_id is required")
    @Min(value = 1, message = "order_id must be a positive number")
    private Long orderId;

    @NotNull(message = "order_id is required")
    @Min(value = 1, message = "order_id must be a positive number")
    private Long customerId;

    @NotBlank(message = "customer email is required")
    @Email(message = "email is invalid")
    private String customerEmail;

    @NotNull(message = "date is required")
    private LocalDateTime datetime;

    @NotBlank(message = "previous status is required")
    private String statusPrevious;

    @NotBlank(message = "current status is required")
    private String status;

    @NotNull(message = "order_id is required")
    @Min(value = 1, message = "order_id must be a positive number")
    private Long employeeId;

    @NotBlank(message = "employee email is required")
    @Email(message = "email is invalid")
    private String employeeEmail;
}
