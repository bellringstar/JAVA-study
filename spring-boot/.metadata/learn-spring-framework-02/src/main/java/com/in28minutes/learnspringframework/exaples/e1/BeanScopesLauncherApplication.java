package com.in28minutes.learnspringframework.exaples.e1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //기본적으로 singleton
class NormalClass {
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
}



@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
			
			System.out.println(context.getBean(NormalClass.class)); //@9cb8225
			System.out.println(context.getBean(NormalClass.class)); //@9cb8225
			
			
			System.out.println(context.getBean(PrototypeClass.class)); //@76b07f29
			System.out.println(context.getBean(PrototypeClass.class)); //@38af9828
			System.out.println(context.getBean(PrototypeClass.class)); //@376a0d86
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	} 

}
