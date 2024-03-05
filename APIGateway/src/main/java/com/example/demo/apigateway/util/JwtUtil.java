package com.example.demo.apigateway.util;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtUtil {

	public static final String SECRET="3273357638792F423F4528482B4D6251655368566D597133743677397A244326";

	// Private method to get the secret key for signing the JWT
	private Key getSecKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}


	public void validateToken(final String token) {
		Jwts.parserBuilder().setSigningKey(getSecKey()).build().parseClaimsJws(token);
	}

	
}
