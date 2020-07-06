package cn.eirture.aop.sequence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.eirture.aop.sequence")
@EnableAspectJAutoProxy
public class Config {
}
