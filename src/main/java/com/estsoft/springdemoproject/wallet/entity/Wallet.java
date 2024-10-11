//package com.estsoft.springdemoproject.wallet.entity;
//
//import com.estsoft.springdemoproject.wallet.model.AccountDTO;
//import com.estsoft.springdemoproject.wallet.model.WalletDTO;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Setter
//@DiscriminatorColumn(name = "type")
//public abstract class Wallet extends WalletEntityObject {
//    // walletentityobject -> wallet -> CustomerWallet(일반사용자), SystemWallet(내부), MerchantWallet(개인사업자)
//    @Column(name = "user_id")
//    private String userId;
//
//    @Transient
//    public String getDiscriminatorValue() {
//        DiscriminatorValue val = this.getClass().getAnnotation(DiscriminatorValue.class);
//        return val == null ? null : val.value();
//    }
//
//    @Getter
//    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
//    protected Collection<Account> accounts;
//
//    public abstract long getTotalBalance();
//
//    public Wallet(String userId) {
//        this.setUserId(userId);
//        this.accounts = new ArrayList<>();
//    }
//
//    public Account createAccount(Account account) {
//        this.accounts.add(account);
//        return account;
//    }
//
//    public WalletDTO convertToDTO() {
//        List<AccountDTO> accountDTOs = accounts.stream().filter(Account::isVisible)
//                .map(Account::convertToDTO)
//                .collect(Collectors.toList());
//
//        return new WalletDTO(id, userId, getDiscriminatorValue(), getTotalBalance(), accountDTOs);
//    }
//}