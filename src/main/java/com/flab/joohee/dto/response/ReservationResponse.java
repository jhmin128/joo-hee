package com.flab.joohee.dto.response;

import com.flab.joohee.model.enums.ReservationStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReservationResponse {
	private String reservationId;
	private String userId;
	private String reservation_name;
	private String reservation_code;
	private LocalDateTime reservation_date;
	private ReservationStatus status;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
}
