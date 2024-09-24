package com.flab.joohee.controller;

import com.flab.joohee.dto.request.ReservationRequest;
import com.flab.joohee.dto.response.ReservationResponse;
import com.flab.joohee.service.ReservationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("v1/reservations")
@RequiredArgsConstructor
public class ReservationController {
	private final ReservationService reservationService;

	@GetMapping
	public List<ReservationResponse> getReservations(ReservationRequest request) {
		return reservationService.getReservations(request);
	}

	@GetMapping("/{reservationId}")
	public ReservationResponse getReservation(@PathVariable String reservationId) {
		return reservationService.getReservation(reservationId);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ReservationResponse createReservation(@Valid @RequestBody ReservationRequest request) {
		return reservationService.createReservation(request);
	}

	@PutMapping("/{reservationId}")
	public ReservationResponse updateReservation(@PathVariable String reservationId, @RequestBody ReservationRequest request) {
		return reservationService.updateReservation(reservationId, request);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{reservationId}")
	public ReservationResponse deleteReservation(@PathVariable String reservationId) {
		return reservationService.deleteReservation(reservationId);
	}

}
