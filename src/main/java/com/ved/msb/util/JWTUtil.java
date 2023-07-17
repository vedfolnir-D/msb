package com.ved.msb.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
    private static String JWT_SECRET = "ABCDEFG-OPQ-1234567890";
    private static long EXP_MS = 86400000;

    public static String generateToken(String oaAccount) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expiryDate = now.plus(EXP_MS, ChronoUnit.MILLIS);
        Map<String, Object> claims = new HashMap<>();
        claims.put("sub", oaAccount);
        claims.put("iat", now);
        claims.put("exp", expiryDate);

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS256, JWT_SECRET).compact();
    }

    public static void main(String[] args) {
        System.out.println(generateToken("denghaoran"));
    }
}
