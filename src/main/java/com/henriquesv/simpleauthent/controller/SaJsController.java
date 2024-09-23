package com.henriquesv.simpleauthent.controller;

import com.henriquesv.simpleauthent.entity.SaJsEntity;
import com.henriquesv.simpleauthent.service.SajsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/api")
public class SaJsController {

    @Autowired
    SajsService sajsService;

    @Operation(summary = "Operação de login que retorna uma jwt")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "login feito com sucesso",
                    content =  @Content),
            @ApiResponse(responseCode = "404", description = "username ou password incorreto",
                    content =  @Content) })
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody SaJsEntity authEntity){

        return new ResponseEntity<>(sajsService.serviceLogin(authEntity));
    }

    @GetMapping("/page-only-user-autorization")
    public ResponseEntity authRote(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
