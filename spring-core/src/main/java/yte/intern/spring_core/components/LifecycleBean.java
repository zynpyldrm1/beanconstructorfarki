package yte.intern.spring_core.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {
    public void print(){
        System.out.println("Print içerisindeyim!");
    }
    @PostConstruct
    public void init(){
        System.out.println("Postconstructor içerisindeyim!");
    }

    public LifecycleBean(){
        System.out.println("Constructor içerisindeyim!");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy içerisindeyim!");
    }
}
