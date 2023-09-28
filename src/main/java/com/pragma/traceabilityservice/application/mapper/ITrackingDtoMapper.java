package com.pragma.traceabilityservice.application.mapper;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITrackingDtoMapper {

    TrackingModel mapToTrackingModel(TrackingRequest trackingRequest);

}
