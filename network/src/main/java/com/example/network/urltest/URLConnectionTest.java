package com.example.network.urltest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLConnectionTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://ojc.asia/");
        URLConnection con = url.openConnection();

        System.out.println(con.getContentType());

        Map<String, List<String>> header = con.getHeaderFields();
        System.out.println("--------------------------------");

        for (Map.Entry<String, List<String>> mp: header.entrySet()){
            System.out.println(mp.getKey() + " : ");
            System.out.println(mp.getValue().toString());
        }
        System.out.println();
        System.out.println("--------------------------------");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
        in.close();


    }

}
