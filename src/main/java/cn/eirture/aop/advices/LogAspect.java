package cn.eirture.aop.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* cn.eirture.aop.advices.AccountService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log before executing..." + joinPoint.getSignature().getName());
        System.out.println(joinPoint.getTarget().getClass().getName());
        System.out.println("Args: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getThis().getClass().getName());
    }

    @After("execution(* cn.eirture.aop.advices.CustomerService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Log after executing---");
    }

    @AfterReturning(pointcut = "execution(* *(..))", returning = "myname")
    public void logAfterReturning(String myname) {
        System.out.println("Return value: " + myname);
    }

    @AfterThrowing(pointcut = "execution(* getAge(..))", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, MyException e) {
        System.out.println(joinPoint.getSignature().getName() + " throw exception: " + e.getMessage());
    }

    @Around("execution(* cn.eirture.aop.advices.CustomerService.calculatePayment(double, int))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Args in Around Advices: " + args[0] + ", " + args[1]);

        args[0] = 30;
        args[1] = 9;

        Object result = null;
        try {
//            result = joinPoint.proceed(); // call the actual method
            result = joinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Result in Around Advice: " + result);
        return 60.0;
    }
}
