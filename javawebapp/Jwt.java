package com.greenanimalsbank.employee.security;


public class JwtConstants {

    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "greenanimalsbank";
    public static final String TOKEN_AUDIENCE = "employee-api-clients";
    public static final long TOKEN_EXPIRATION = 900000L;
    public static final String JWT_SECRET = "4Bgtrv8TFneGyv1";

    private JwtConstants() {
    }
}