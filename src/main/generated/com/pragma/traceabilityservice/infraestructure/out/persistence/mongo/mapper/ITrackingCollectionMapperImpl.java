package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.mapper;

import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.collection.TrackingCollection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-28T23:48:19-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class ITrackingCollectionMapperImpl implements ITrackingCollectionMapper {

    @Override
    public TrackingCollection mapToTrackingCollection(TrackingModel trackingModel) {
        if ( trackingModel == null ) {
            return null;
        }

        TrackingCollection trackingCollection = new TrackingCollection();

        trackingCollection.setId( trackingModel.getId() );
        trackingCollection.setOrderId( trackingModel.getOrderId() );
        trackingCollection.setCustomerId( trackingModel.getCustomerId() );
        trackingCollection.setCustomerEmail( trackingModel.getCustomerEmail() );
        trackingCollection.setDatetime( trackingModel.getDatetime() );
        trackingCollection.setStatusPrevious( trackingModel.getStatusPrevious() );
        trackingCollection.setStatus( trackingModel.getStatus() );
        trackingCollection.setEmployeeId( trackingModel.getEmployeeId() );
        trackingCollection.setEmployeeEmail( trackingModel.getEmployeeEmail() );

        return trackingCollection;
    }
}
