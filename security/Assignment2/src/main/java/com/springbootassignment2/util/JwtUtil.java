package com.springbootassignment2.util;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

	//private final String SECRET_KEY="1234";
	
//	public String generateToken(String username) {
//        return Jwts.builder()
//            .setSubject(username)
//            .setIssuedAt(new Date())
//            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
//            .signWith(SignatureAlgorithm.HS256, secretKey)
//            .compact();
//    }
//
//    public String extractUsername(String token) {
//        return Jwts.parser()
//            .setSigningKey(secretKey)
//            .parseClaimsJws(token)
//            .getBody()
//            .getSubject();
//    }
}
