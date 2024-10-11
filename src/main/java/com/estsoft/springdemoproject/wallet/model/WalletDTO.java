//package com.estsoft.springdemoproject.wallet.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Getter
//@AllArgsConstructor
//public class WalletDTO {
//    private Long id;
//    private String walletOwnerId;
//    private String walletType;
//    private long balance;
//    private Collection<AccountDTO> accounts;
//
//    public WalletDTO convertToDTO() {
//        List<AccountDTO> accountDTOs = accounts.stream().filter(Account::isVisible)
//                .map(Account::convertToDTO)
//                .collect(Collectors.toList());
//
//        return new WalletDTO(id, userId, getDiscriminatorValue(), getTotalBalance(), accountDTOs);
//    }
//}
//
//
