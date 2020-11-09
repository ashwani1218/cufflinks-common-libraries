package com.cufflinks.commonlibraries.util;


import com.cufflinks.commonlibraries.constants.JWTConstants;
import com.cufflinks.commonlibraries.dto.entity.Team;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(JWTUtil.class);
	

//	@Value("${jjwt.expiration}")
	private String expirationTime = "28800";
	

	byte[] secretKey = Base64.getDecoder().decode(JWTConstants.SECRET);
	
	private Key key = Keys.hmacShaKeyFor(secretKey);;
	
//	@PostConstruct
//	public void init(){
//		this.key = Keys.hmacShaKeyFor(secretKey);
//	}

	public Claims getAllClaimsFromToken(String token) {
		return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
	}
	
	public String getUsernameFromToken(String token) {
		return getAllClaimsFromToken(token).getSubject();
	}
	
	public Date getExpirationDateFromToken(String token) {
		return getAllClaimsFromToken(token).getExpiration();
	}
	
	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	public String generateToken(Team team) {
		Map<String, Object> claims = new HashMap<>();
		
		return doGenerateToken(claims, team.getTeamName());
	}

	private String doGenerateToken(Map<String, Object> claims, String username) {
		Long expirationTimeLong = Long.parseLong(expirationTime); //in second
		
		final Date createdDate = new Date();
		final Date expirationDate = new Date(createdDate.getTime() + expirationTimeLong * 1000);

		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(createdDate)
				.setExpiration(expirationDate)
				.signWith(key)
				.compact();
	}
	
	public Boolean isValidToken(String token) {
		LOGGER.info("token : {}", token);
		LOGGER.info("Key : {}", key);
		
		
		try{
			if(!isTokenExpired(token)) {
				Jwts.parserBuilder().setSigningKey(Keys.hmacShaKeyFor(secretKey)).build().parseClaimsJws(token);
			}
			return true;
		}
		catch(JwtException e) {
			return false;
		}
	}
}
