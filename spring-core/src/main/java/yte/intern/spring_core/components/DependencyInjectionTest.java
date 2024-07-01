package yte.intern.spring_core.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {
    @Autowired
    private FieldInjectionBean fieldInjectionBean;
    private SetterInjectionBean setterInjectionBean;
    private ConstructorInjection constructorInjection;
    @Autowired
    public DependencyInjectionTest(ConstructorInjection constructorInjection) {
        this.constructorInjection = constructorInjection;
    }

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }

    public void print(){
        fieldInjectionBean.print();
        setterInjectionBean.print();
        constructorInjection.print();
    }
}
