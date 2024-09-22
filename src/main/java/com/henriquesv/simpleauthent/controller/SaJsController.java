package com.henriquesv.simpleauthent.controller;

import com.henriquesv.simpleauthent.entity.SaJsEntity;
import com.henriquesv.simpleauthent.service.SajsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaJsController {

    @Autowired
    SajsService sajsService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody SaJsEntity authEntity){

        return new ResponseEntity<>(sajsService.serviceLogin(authEntity));
    }

    @GetMapping
    public ResponseEntity authRote(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
