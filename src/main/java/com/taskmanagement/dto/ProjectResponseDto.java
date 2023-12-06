package com.taskmanagement.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProjectResponseDto extends CommonApiResponse {
	
	public List<ProjectDto> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectDto> projects) {
		this.projects = projects;
	}

	List<ProjectDto> projects;
	
}

