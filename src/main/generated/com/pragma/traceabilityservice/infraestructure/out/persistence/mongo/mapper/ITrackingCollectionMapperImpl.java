package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.mapper;

import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.collection.TrackingCollection;
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

    @Override
    public List<TrackingModel> mapToTrackingModelList(List<TrackingCollection> trackingCollectionList) {
        if ( trackingCollectionList == null ) {
            return null;
        }

        List<TrackingModel> list = new ArrayList<TrackingModel>( trackingCollectionList.size() );
        for ( TrackingCollection trackingCollection : trackingCollectionList ) {
            list.add( trackingCollectionToTrackingModel( trackingCollection ) );
        }

        return list;
    }

    protected TrackingModel trackingCollectionToTrackingModel(TrackingCollection trackingCollection) {
        if ( trackingCollection == null ) {
            return null;
        }

        TrackingModel trackingModel = new TrackingModel();

        trackingModel.setId( trackingCollection.getId() );
        trackingModel.setOrderId( trackingCollection.getOrderId() );
        trackingModel.setCustomerId( trackingCollection.getCustomerId() );
        trackingModel.setCustomerEmail( trackingCollection.getCustomerEmail() );
        trackingModel.setDatetime( trackingCollection.getDatetime() );
        trackingModel.setStatusPrevious( trackingCollection.getStatusPrevious() );
        trackingModel.setStatus( trackingCollection.getStatus() );
        trackingModel.setEmployeeId( trackingCollection.getEmployeeId() );
        trackingModel.setEmployeeEmail( trackingCollection.getEmployeeEmail() );

        return trackingModel;
    }
}
