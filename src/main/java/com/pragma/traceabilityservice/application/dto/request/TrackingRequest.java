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

    @Email(message = "email is invalid")
    private String customerEmail;

    @NotNull(message = "date is required")
    private LocalDateTime datetime;

    private String statusPrevious;

    @NotBlank(message = "current status is required")
    private String status;

    @NotNull(message = "employee_id is required")
    @Min(value = 0, message = "order_id must be a positive number")
    private Long employeeId;

    @Email(message = "email is invalid")
    private String employeeEmail;
}
