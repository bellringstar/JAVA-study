package com.in28minutes.learnspringframework.exaples.c1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			int max = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println(max);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	} 

}
