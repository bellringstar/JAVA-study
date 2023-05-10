package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("----------");

        //Object Mapper : Text  Json -> Object
        //Object -> Text Json

        var objectMapper = new ObjectMapper();

        // object to text
        // object mapper는 get method를 활용한다. -> 다른 method를 만들때 이름에 get을 붙이면 안된다
        var user = new User("steve", 10, "00-00-00");

        var text = objectMapper.writeValueAsString(user);
        System.out.println("text = " + text);
        
        // text to object
        // object mapper는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println("objectUser = " + objectUser);
        
        
    }   

}
