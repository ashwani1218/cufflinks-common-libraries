/**
 * @author Ashwani Pandey
 *
 *   createdAt 5 Jul, 2020
 * 
 */
package com.cufflinks.common.dto.model.request;

import com.cufflinks.common.dto.model.GenericRequest;

import javax.validation.constraints.NotNull;

public class LoginRequest implements GenericRequest {

	@NotNull(message = "${NotNull.teamName}")
	private String teamName;

	@NotNull(message = "${NotNull.password}")
	private String password;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
