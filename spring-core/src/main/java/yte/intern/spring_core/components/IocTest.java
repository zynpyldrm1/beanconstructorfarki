package yte.intern.spring_core.components;

import org.springframework.stereotype.Component;

@Component
public class IocTest {

    public String name = "Fatih";
    public void test(){
        System.out.println("Welcome to spring!");
    }
}
