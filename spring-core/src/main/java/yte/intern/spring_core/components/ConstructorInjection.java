package yte.intern.spring_core.components;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

    public void print(){
        System.out.println("Ben bir constructor bean'iyim!");

    }
}
