package com.cardservice.card.dao;

import com.cardservice.card.entities.Card;

import java.util.Optional;

public interface CardDAO {
    Optional<Card> findByCardNumber(String cardNumber);

    Card save(Card card);
}
