package com.taskmanagement.dto;

import java.util.List;

import com.taskmanagement.entity.User;

import lombok.Data;

@Data
public class UsersResponseDto extends CommonApiResponse {
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	private List<User> users;

}
