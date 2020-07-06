package cn.eirture.aop.terms;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.eirture.aop.terms")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
}
