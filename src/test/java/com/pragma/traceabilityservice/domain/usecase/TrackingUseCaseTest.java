package com.pragma.traceabilityservice.domain.usecase;

import com.pragma.traceabilityservice.domain.exception.DomainException;
import com.pragma.traceabilityservice.domain.model.TrackingModel;
import com.pragma.traceabilityservice.domain.spi.ITrackingPersistencePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TrackingUseCaseTest {
    @InjectMocks
    TrackingUseCase trackingUseCase;
    @Mock
    ITrackingPersistencePort trackingPersistencePort;
    @Test
    void trackingOrder() {
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.setStatus("IN_PREPARATION");
        trackingModel.setStatusPrevious("PENDING");

        trackingUseCase.trackingOrder(trackingModel);

        verify(trackingPersistencePort, times(1)).trackingOrder(trackingModel);
    }
    @Test
    void trackingOrderBothStatusAreEqual() {
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.setStatus("PENDING");
        trackingModel.setStatusPrevious("PENDING");

        assertThrows(DomainException.class, () -> trackingUseCase.trackingOrder(trackingModel));

        verify(trackingPersistencePort, never()).trackingOrder(trackingModel);
    }
}