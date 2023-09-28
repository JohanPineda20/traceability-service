package com.pragma.traceabilityservice.domain.model;

import java.time.LocalDateTime;

public class TrackingModel {
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDateTime createdAt;
    private String statusPrevious;
    private String status;
    private Long employeeId;
    private String employeeEmail;

    public TrackingModel() {
    }

    public TrackingModel(String id, Long orderId, Long customerId, String customerEmail, LocalDateTime createdAt, String statusPrevious, String status, Long employeeId, String employeeEmail) {
        this.id = id;
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.createdAt = createdAt;
        this.statusPrevious = statusPrevious;
        this.status = status;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatusPrevious() {
        return statusPrevious;
    }

    public void setStatusPrevious(String statusPrevious) {
        this.statusPrevious = statusPrevious;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
