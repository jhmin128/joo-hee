package com.flab.joohee.dto.response;

import com.flab.joohee.model.errorcode.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class JooHeeResponse<T> {
	private String code;
	private int status;
	private Object message;
	private T data;

	public JooHeeResponse(String code, int status, Object message) {
		this.code = code;
		this.status = status;
		this.message = message;
	}

	public JooHeeResponse(ErrorCode errorCode) {
		this(errorCode.code(), errorCode.status(), errorCode.errorMsg());
	}

	public JooHeeResponse(T data) {
		this("Success", HttpStatus.OK.value(), HttpStatus.OK.name());
		this.data = data;
	}

	public String toMessage() {
		return String.format("%d : [%s] - %s", status, code, message);
	}
}
