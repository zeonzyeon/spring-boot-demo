//package com.estsoft.springdemoproject.wallet.entity;
//
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import lombok.Data;
//
//@Embeddable
//@Data
//public class Money {
//    @Enumerated(EnumType.STRING)
//    private Currency currency;
//    private Long amounts;
//
//    public Money() {}
//
//    public Money(Long amounts) {
//        this.currency = Currency.WON;
//        this.amounts = amounts;
//    }
//}