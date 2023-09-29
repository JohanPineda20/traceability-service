package com.pragma.traceabilityservice.application.mapper;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.dto.response.TrackingResponse;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITrackingDtoMapper {

    TrackingModel mapToTrackingModel(TrackingRequest trackingRequest);
    List<TrackingResponse> mapToTrackingResponseList(List<TrackingModel> trackingModelList);
}
