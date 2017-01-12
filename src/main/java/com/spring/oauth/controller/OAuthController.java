package com.spring.oauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class OAuthController {

    @GetMapping(value = "/data",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getData(){
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Google");
        strList.add("Facebook");
        strList.add("Microsoft");
        return new ResponseEntity(strList, HttpStatus.OK);
    }
}
