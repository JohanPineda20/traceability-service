package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "Traceability")
public class TrackingCollection {
    @Id
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDateTime createdAt;
    private String statusPrevious;
    private String status;
    private Long employeeId;
    private String employeeEmail;
}
