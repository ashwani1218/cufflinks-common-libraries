/**
 * 
 */
package com.cufflinks.common.dto.model.request;

import com.cufflinks.common.dto.entity.Team;
import com.cufflinks.common.dto.model.GenericRequest;

/**
 *
 * @author Ashwani Pandey
 *
 * createdAt 23 Jul, 2020
 *
*/
public class UpdateTeamRequest  implements GenericRequest {

	private Team team;
	
	private String token;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
