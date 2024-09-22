package com.henriquesv.simpleauthent.service;

import com.henriquesv.simpleauthent.entity.SaJsEntity;
import com.henriquesv.simpleauthent.repository.SaJsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class SajsService {

    @Autowired
    SaJsRepository saJsRepository;

    public HttpStatus serviceLogin(SaJsEntity authEntity){
        if(saJsRepository.findByusername(authEntity.getUsername()).isEmpty()){
            return HttpStatus.NO_CONTENT;
        }
        else {
            return HttpStatus.OK;
        }
    }

}
