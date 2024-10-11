//package com.estsoft.springdemoproject.wallet.entity;
//
//import jakarta.persistence.DiscriminatorValue;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Optional;
//
//@Table(name = "wallet")
//@Entity(name = "MerchantWallet")
//@DiscriminatorValue("MERCHAT")
//@NoArgsConstructor
//@Getter
//@Setter
//public class MerchantWallet extends Wallet {
//    @Transient
//    private Account emoney;
//
//    public MerchantWallet(String userId) {
//        super(userId);
//    }
//
//    public Account emoney() {
//        if (emoney != null)
//            return emoney;
//        this.emoney = findAccountByType(AccountType.EMONEY).orElseThrow(
//                () -> new RuntimeException("EMONEY not found")
//        );
//
//        return this.emoney;
//    }
//
//    public Optional<Account> findAccountByType(AccountType type) {
//        return accounts.stream().filter(a -> a.getType() == type).findFirst();
//    }
//
//    @Override
//    public long getTotalBalance() {
//        long sum =  emoney().getBalance().getAmounts();
//        return sum;
//    }
//}
