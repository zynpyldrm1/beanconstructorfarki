package yte.intern.spring_core.components;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {

    public void print(){
        System.out.println("Ben bir setter bean'iyim!");
    }

}
