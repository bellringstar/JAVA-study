package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello") //http://localhost:9090/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    // 예전 방식
    @RequestMapping(path="/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }
    //http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName){
//    public String pathVariable(@PathVariable String name){

        System.out.println("pathVariable = " + pathName);
        return pathName;
    }

    // Query Parameter
    // search?pglt=641
    // &q=intellij
    // &cvid=5e9fd4044a5641ddbc7b60d9d32c57ff
    // &aqs=edge.2.69i57j0l6j69i61l2.2519j0j1
    // &FORM=ANNTA1
    // &PC=U531

    // ?key=value&key2=value2

    // http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=33
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("age = " + age);
        return name + " " + email + " " + age;
    }

    //가장 많이 쓰는 방법 별도의 패키지의 클래스 생성 해 객체로 받기
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println("name = " + userRequest.getName());
        System.out.println("email = " + userRequest.getEmail());
        System.out.println("age = " + userRequest.getAge());
        return userRequest.toString();
    }

}
