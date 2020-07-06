package cn.eirture.aop.xml;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    public void doSomething() {
        System.out.println("Do something in the CustomerServiceImpl...");
    }
}
