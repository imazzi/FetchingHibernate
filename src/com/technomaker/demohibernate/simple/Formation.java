package com.technomaker.demohibernate.simple;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Formation {

	private Long idFormation;
	private String theme;
	private Set<Participant> participants;

	public Formation(String theme, Set<Participant> participants) {
		this.theme = theme;
		this.participants = participants;
	}

	public Formation(String theme) {
		this.theme = theme;
	}

	public Long getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}

	public Set<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
}
