package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
//record jdk16에서 추가. -> getter,setter등을 만들 필요가 없다 자동으로 생성
record Address(String firstLine, String city) {};

@Configuration//Spring 설정으로 등록
public class HelloWorldConfiguration {
	//Spring Bean = Spring에서 관리하는 것들
	
	@Bean //Bean으로 등록
	public String name(){
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 10;
	}
	
	@Bean
	public Person person () {
		return new Person("Ravi", 20, new Address("Main", "London"));
		
	}
	
	@Bean
	public Person person2MethodCall () {
		return new Person(name(), age(), address() ); 
	}
	
	@Bean
	public Person person3Parameters (String name, int age, Address address2) {
		return new Person(name, age, address2 ); 
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("광주", "대한민국");
	}
	
}
