package com.example.hello.controller;


import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestData, @PathVariable Long userId){
        System.out.println("requestData = " + requestData);
        System.out.println("userId = " + userId);
        return requestData;
    }
}
