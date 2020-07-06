package cn.eirture.aop.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))")
    public void logBefore() {
        System.out.println("Log before executing...");
    }

    @After("execution(* cn.eirture.aop.advices.CustomerService.*(..))")
    public void logAfter() {
        System.out.println("Log after executing---");
    }
}
