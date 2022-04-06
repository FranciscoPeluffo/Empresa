package com.cardservice.card.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CardPostRequest {
    private String cardHolder;
    private String cardNumber;
    private LocalDate expirationDate;
    private String cvv;
    private BigDecimal limitAmount;
}
