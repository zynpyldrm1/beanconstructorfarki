package yte.intern.spring_core.components;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {

    public void print(){
        System.out.println("Ben bir field injection bean'iyim!");
    }
}
