package com.example.network.urltest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) throws IOException {
        URL aUrl = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java+%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC");
        //https
        System.out.println("protocol name: " + aUrl.getProtocol());

        //host : search.naver.com
        System.out.println("host name: " + aUrl.getHost());

        //file : /search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java+%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC
        System.out.println("file name: " + aUrl.getFile());

        //Query : where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java+%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC
        System.out.println("Query: " + aUrl.getQuery());

        //path ; /search.naver
        System.out.println("Path: " + aUrl.getPath());

        //port 생성자에 포트가 기술되어있다면 표시 아니면 -1
        System.out.println("port name: " + aUrl.getPort());

        //HTML 문서 내부의 위치를 지정하는 <a name="..."> 태그의 값
        // URL에서 '#'으로 표시된 부분
        System.out.println("ref: " + aUrl.getRef());

        //html을 죄다 긁어온다.
        BufferedReader br = new BufferedReader(new InputStreamReader(aUrl.openStream()));
        // BufferedReader 쓰는 이유는 readLine 이라는 한 라인씩 읽어오는 메서드가 좋아서.
        // Reader의 경우 2바이트 씩 읽는데 openStream은 1바이트씩 읽기 때문에 2바이트씩 읽기 위해 변환.
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
