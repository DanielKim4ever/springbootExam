package com.springbootexam.springboot.service;

import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Autowired
    private RestTemplate  restTemplate;

    public String getDataFromMultipleApis() {

        Instant start = Instant.now();
        String uri1 ="http://worldtimeapi.org/api/timezone/Asia/Seoul";
        String uri2 ="http://worldtimeapi.org/api/timezone/Europe/London";
        String uri3 ="http://worldtimeapi.org/api/timezone/America/Argentina/Salta";
        String uri4 ="http://worldtimeapi.org/api/timezone/Asia/Qatar";
        String uri5 ="http://worldtimeapi.org/api/timezone/Australia/Melbourne";
        String uri6 ="http://worldtimeapi.org/api/timezone/Asia/Oral";
        String uri7 ="http://worldtimeapi.org/api/timezone/Asia/Singapore";
        String uri8 ="http://worldtimeapi.org/api/timezone/Asia/Taipei";
        String uri9 ="http://worldtimeapi.org/api/timezone/America/Rio_Branco";
        String uri10 ="http://worldtimeapi.org/api/timezone/America/Scoresbysund";


        String response1 = restTemplate.getForObject(uri1, String.class);
        String response2 = restTemplate.getForObject(uri2, String.class);
        String response3 = restTemplate.getForObject(uri3, String.class);
        String response4 = restTemplate.getForObject(uri4, String.class);
        String response5 = restTemplate.getForObject(uri5, String.class);
        String response6 = restTemplate.getForObject(uri6, String.class);
        String response7 = restTemplate.getForObject(uri7, String.class);
        String response8 = restTemplate.getForObject(uri8, String.class);
        String response9 = restTemplate.getForObject(uri9, String.class);
        String response10 = restTemplate.getForObject(uri9, String.class);


        Instant end = Instant.now();
        System.out.println("수행 시간: " + Duration.between(start, end).toMillis() + " ms");
        return response1 + "|" + response2 + "|" +  response3 + "|" +  response4 + "|" + response5 + "|" + response6 +"|"+response7 +"|";
    }

}
