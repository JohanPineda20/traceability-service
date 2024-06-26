package com.pragma.traceabilityservice.infraestructure.input.rest;

import com.pragma.traceabilityservice.application.dto.request.TrackingRequest;
import com.pragma.traceabilityservice.application.dto.response.TrackingResponse;
import com.pragma.traceabilityservice.application.handler.ITrackingHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Traceability Controller")
@RestController
@RequestMapping("/tracking")
@RequiredArgsConstructor
public class TrackingController {

    private final ITrackingHandler trackingHandler;

    @Operation(summary = "Track order status changes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "order traceability created", content = @Content),
            @ApiResponse(responseCode = "400", description = "Bad request: wrong input data", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
            @ApiResponse(responseCode = "409", description = "Both states must not be equal", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
    })
    @SecurityRequirement(name = "jwt")
    @PostMapping
    @PreAuthorize("hasAnyAuthority({'EMPLOYEE', 'CUSTOMER'})")
    public ResponseEntity<Void> trackingOrder(@Valid @RequestBody TrackingRequest trackingRequest){
        trackingHandler.trackingOrder(trackingRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @Operation(summary = "Get history of order status changes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "History checked", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = TrackingResponse.class)))),
            @ApiResponse(responseCode = "400", description = "Bad request: wrong input data", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
            @ApiResponse(responseCode = "404", description = "the order doesn't have history", content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Exception"))),
    })
    @SecurityRequirement(name = "jwt")
    @GetMapping
    @PreAuthorize("hasAuthority('CUSTOMER')")
    public ResponseEntity<List<TrackingResponse>> getHistoryOrder(@RequestParam Long orderId){
        return ResponseEntity.ok(trackingHandler.getHistoryOrder(orderId));
    }
}
