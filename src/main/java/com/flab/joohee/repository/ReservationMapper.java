package com.flab.joohee.repository;

import com.flab.joohee.model.domain.entity.Reservation;
import com.flab.joohee.dto.request.ReservationRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationMapper {

	List<Reservation> getReservations(ReservationRequest request);

	Reservation getReservation(String reservationId);

	int createReservation(ReservationRequest request);

	int updateReservation(String reservationId, ReservationRequest request);
}
