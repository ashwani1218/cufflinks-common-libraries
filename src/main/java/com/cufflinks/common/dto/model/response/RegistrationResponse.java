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
