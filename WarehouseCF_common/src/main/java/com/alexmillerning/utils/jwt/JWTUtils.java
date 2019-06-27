/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.utils.jwt;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {
    static final Logger logger = Logger.getLogger(JWTUtils.class);
    private static final String SECRET  = "alexmillerning.com37554567yhjn!!edwgdyg@pkeog___8jkjgi**iY^%43";
    private static final String ISSUER = "alexmillerning.com";
    public static String createToken(Map<String ,String> claims){
        try{
            long nowMillis = System.currentTimeMillis();
            Date now = new Date(nowMillis);
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTCreator.Builder builder = JWT.create()
                    .withIssuer(ISSUER)
                    .withExpiresAt(DateUtils.addHours(new Date(),1))
                    .withIssuedAt(now);
            claims.forEach(builder::withClaim);
            return builder.sign(algorithm);
        }catch (JWTVerificationException e){
            logger.error("token生成失败 ["+e.getMessage()+"]");
            return null;
        }
    }
    public static Map<String, String> verifyToken(String token){
        Map<String, Claim> map;
        try{
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(ISSUER).build();
            DecodedJWT jwt = verifier.verify(token);
            map = jwt.getClaims();
            Map<String, String> resultMap = new HashMap<>(map.size());
            map.forEach((k, v) -> resultMap.put(k, v.asString()));
            return resultMap;
        }catch (JWTVerificationException e){
            logger.error("token校验失败 ["+e.getMessage()+"]");
            return null;
//            throw new Exception("校验失败");
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "10001");
        map.put("pwd","JISENNGUiji*ishfo4JSIJFijn");
        try {
            String token = createToken(map);
            System.out.println(token);
            Map<String, String> res = verifyToken(token);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
