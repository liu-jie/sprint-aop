package cn.eirture.aop.terms;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    public void doSomething() {
        System.out.println("Do something in CustomerServiceImpl...");
    }

}
