package com.cardservice.card.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "CARDS")
public class Card {
    @Column(name = "CARD_HOLDER")
    private String cardHolder;
    @Column(name = "CARD_NUMBER")
    private String cardNumberHash;
    @Column(name = "EXP_DATE")
    private LocalDate expirationDate;
    @Column(name = "CVV")
    private String cvvHash;
    @Column(name = "LIMIT_AMOUNT")
    private BigDecimal limitAmount;
}
