package yte.intern.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import yte.intern.spring_core.components.DependencyInjectionTest;
import yte.intern.spring_core.components.InjectionTest;
import yte.intern.spring_core.components.IocTest;
import yte.intern.spring_core.components.LifecycleBean;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		//IocTest iocTest = context.getBean(IocTest.class);
		//iocTest.test();
		//IocTest iocTest2 = context.getBean(IocTest.class);
		//iocTest2.name="Muhammed";
		//System.out.println(iocTest.name);
		//DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
		//dependencyInjectionTest.print();
		//LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
		//lifecycleBean.print();
		InjectionTest injectionTest=context.getBean(InjectionTest.class);
		injectionTest.print();
	}

}
