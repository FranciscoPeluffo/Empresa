package com.cardservice.card.mappers;

import com.cardservice.card.dto.CardPostRequest;
import com.cardservice.card.dto.CardPostResponse;
import com.cardservice.card.entities.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper{

    @Mapping(source = "cvv", target = "cvvHash")
    @Mapping(source = "cardNumber", target = "cardNumberHash")
    public Card cardPostRequestToCard (CardPostRequest cardPostRequest);

    public CardPostResponse cardToCardPostResponse(Card card);

}
