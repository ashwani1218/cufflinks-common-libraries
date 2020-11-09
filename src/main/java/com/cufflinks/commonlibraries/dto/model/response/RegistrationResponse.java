/**
 * 
 */
package com.cufflinks.commonlibraries.dto.model.response;

import com.cufflinks.commonlibraries.dto.entity.Team;
import com.cufflinks.commonlibraries.dto.model.BaseResponse;
import com.cufflinks.commonlibraries.dto.model.GenericResponse;

/**
 *
 * @author Ashwani Pandey
 *
 * createdAt 5 Jul, 2020
 *
*/
public class RegistrationResponse extends BaseResponse implements GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6746922253029424700L;
	
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
