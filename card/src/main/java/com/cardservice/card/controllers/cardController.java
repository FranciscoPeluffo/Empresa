package com.cardservice.card.controllers;

import com.cardservice.card.dto.CardPostRequest;
import com.cardservice.card.dto.CardPostResponse;
import com.cardservice.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cardController {

    @Autowired
    private CardService service;

    @PostMapping(value = "card")
    public ResponseEntity<CardPostResponse> createCard(@RequestBody CardPostRequest request){
        CardPostResponse response = service.createCard(request);
        return  new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
