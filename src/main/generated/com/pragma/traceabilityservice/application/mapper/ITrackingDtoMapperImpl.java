package com.pragma.traceabilityservice.application.mapper;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.dto.response.TrackingResponse;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-29T00:33:49-0500",
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
        trackingModel.setDatetime( trackingRequest.getDatetime() );
        trackingModel.setStatusPrevious( trackingRequest.getStatusPrevious() );
        trackingModel.setStatus( trackingRequest.getStatus() );
        trackingModel.setEmployeeId( trackingRequest.getEmployeeId() );
        trackingModel.setEmployeeEmail( trackingRequest.getEmployeeEmail() );

        return trackingModel;
    }

    @Override
    public List<TrackingResponse> mapToTrackingResponseList(List<TrackingModel> trackingModelList) {
        if ( trackingModelList == null ) {
            return null;
        }

        List<TrackingResponse> list = new ArrayList<TrackingResponse>( trackingModelList.size() );
        for ( TrackingModel trackingModel : trackingModelList ) {
            list.add( trackingModelToTrackingResponse( trackingModel ) );
        }

        return list;
    }

    protected TrackingResponse trackingModelToTrackingResponse(TrackingModel trackingModel) {
        if ( trackingModel == null ) {
            return null;
        }

        Long orderId = null;
        Long customerId = null;
        String customerEmail = null;
        LocalDateTime datetime = null;
        String statusPrevious = null;
        String status = null;
        Long employeeId = null;
        String employeeEmail = null;

        orderId = trackingModel.getOrderId();
        customerId = trackingModel.getCustomerId();
        customerEmail = trackingModel.getCustomerEmail();
        datetime = trackingModel.getDatetime();
        statusPrevious = trackingModel.getStatusPrevious();
        status = trackingModel.getStatus();
        employeeId = trackingModel.getEmployeeId();
        employeeEmail = trackingModel.getEmployeeEmail();

        TrackingResponse trackingResponse = new TrackingResponse( orderId, customerId, customerEmail, datetime, statusPrevious, status, employeeId, employeeEmail );

        return trackingResponse;
    }
}
