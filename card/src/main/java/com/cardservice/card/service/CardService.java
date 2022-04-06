package com.cardservice.card.service;

import com.cardservice.card.dto.CardPostRequest;
import com.cardservice.card.dto.CardPostResponse;
import com.cardservice.card.entities.Card;
import com.cardservice.card.mappers.CardMapper;
import com.cardservice.card.repositories.CardRepository;
import com.cardservice.card.utils.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    private CardMapper mapper;
    @Autowired
    private CardRepository cardRepository;

    public CardPostResponse createCard(CardPostRequest request) {
        request.setCardNumber(HashUtil.getHash(request.getCardNumber().getBytes(), "SHA-1"));
        request.setCvv(HashUtil.getHash(request.getCvv().getBytes(), "SHA-1"));

        Card card = mapper.cardPostRequestToCard(request);

        cardRepository.save(card);

        return mapper.cardToCardPostResponse(card);
    }
}
