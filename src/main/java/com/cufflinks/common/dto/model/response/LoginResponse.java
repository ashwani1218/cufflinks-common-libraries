/**
 * 
 */
package com.cufflinks.common.dto.model.response;


import com.cufflinks.common.dto.entity.Team;
import com.cufflinks.common.dto.model.BaseResponse;
import com.cufflinks.common.dto.model.GenericResponse;

/**
 *
 * @author Ashwani Pandey
 *
 * createdAt 5 Jul, 2020
 *
*/
public class LoginResponse extends BaseResponse implements GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6992461492309338355L;

	private String token;

	private Team team;
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
	
}
