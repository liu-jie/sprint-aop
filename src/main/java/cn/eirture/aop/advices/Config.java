package cn.eirture.aop.advices;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.eirture.aop.advices")
@EnableAspectJAutoProxy
public class Config {
}
