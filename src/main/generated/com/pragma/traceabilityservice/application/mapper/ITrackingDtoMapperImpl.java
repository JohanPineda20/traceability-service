package com.pragma.traceabilityservice.application.mapper;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-28T16:43:43-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class ITrackingDtoMapperImpl implements ITrackingDtoMapper {

    @Override
    public TrackingModel mapToTrackingModel(TrackingRequest trackingRequest) {
        if ( trackingRequest == null ) {
            return null;
        }

        TrackingModel trackingModel = new TrackingModel();

        trackingModel.setOrderId( trackingRequest.getOrderId() );
        trackingModel.setCustomerId( trackingRequest.getCustomerId() );
        trackingModel.setCustomerEmail( trackingRequest.getCustomerEmail() );
        trackingModel.setStatusPrevious( trackingRequest.getStatusPrevious() );
        trackingModel.setStatus( trackingRequest.getStatus() );
        trackingModel.setEmployeeId( trackingRequest.getEmployeeId() );
        trackingModel.setEmployeeEmail( trackingRequest.getEmployeeEmail() );

        return trackingModel;
    }
}
