package com.cardservice.card.dao;

import com.cardservice.card.entities.Card;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class JpaCardDAO implements CardDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional<Card> findByCardNumber(String cardNumber) {
        return Optional.ofNullable(em.find(Card.class, cardNumber));
    }

    @Override
    public Card save(Card card) {
        em.persist(card);
        return card;
    }
}
