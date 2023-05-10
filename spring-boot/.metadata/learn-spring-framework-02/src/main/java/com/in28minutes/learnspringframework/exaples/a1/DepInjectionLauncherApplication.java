package com.in28minutes.learnspringframework.exaples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//YourBusinessClass
@Component
class YourBusinessClass{
	
//	@Autowired
	Dependency1 dependency1;
	
//	@Autowired
	Dependency2 dependency2;
	
	//@Autowired가 없어도 자동으로 inject -> spring에서 추천하는 방식
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Using " + dependency1 + " and " + dependency2;
	}
}

//Dependency1
@Component
class Dependency1{
	
}
//Dependency2
@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
//@ComponentScan 범위 내에 component가 걸리면 자동으로 인스턴스가 생성되고 주입된다.
public class DepInjectionLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	} 

}
