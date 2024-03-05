//package com.example.ata.validatetoken;
//
//import io.jsonwebtoken.Jwts;  // Import Jwts class
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JwtService {
//
//    @Value("${jwt.secret}")
//    private String secret;
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parserBuilder().setSigningKey(secret).build().parseClaimsJws(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
