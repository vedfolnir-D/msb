package com.ved.msb.security;

// AntiReplayAttackAspect.java

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ved.msb.util.JWTUtil;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;

@Component
@Aspect
public class AntiReplayAspect {

    @Autowired
    private JWTUtil jwtUtil;

    @Pointcut("@annotation(AntiReplay)")
    public void replayAttackPointcut() {}

    @AfterReturning(pointcut = "replayAttackPointcut()", returning = "result")
    public Object preventReplayAttack(JoinPoint joinPoint, Object result) {
        // 在方法执行后执行重放攻击防护逻辑
        Object[] args = joinPoint.getArgs();

        if (args.length > 0 && args[0] instanceof String) {
            String token = (String)args[0];

            try {
                // 验证令牌
                // jwtUtil.validateToken(token);
                // 处理添加 Todo 的逻辑
                // ...

                return result;
            } catch (ExpiredJwtException e) {
                return "Token has expired";
            } catch (JwtException e) {
                return "Invalid token";
            }
        }

        return result;
    }
}
