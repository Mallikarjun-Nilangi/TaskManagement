package com.taskmanagement.dto;

import lombok.Data;

@Data
public class UserLoginResponseDto extends CommonApiResponse {
	
	public UserLoginResponse getUser() {
		return user;
	}

	public void setUser(UserLoginResponse user) {
		this.user = user;
	}

	private UserLoginResponse user;

}
