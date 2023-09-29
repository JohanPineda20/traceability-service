package com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.mapper;

import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.infraestructure.out.persistence.mongo.collection.TrackingCollection;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITrackingCollectionMapper {

    TrackingCollection mapToTrackingCollection(TrackingModel trackingModel);
    List<TrackingModel> mapToTrackingModelList(List<TrackingCollection> trackingCollectionList);
}
