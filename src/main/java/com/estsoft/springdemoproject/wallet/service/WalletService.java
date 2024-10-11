//package com.estsoft.springdemoproject.wallet.service;
//
//import com.estsoft.springdemoproject.wallet.entity.CustomerWallet;
//import com.estsoft.springdemoproject.wallet.entity.MerchantWallet;
//import com.estsoft.springdemoproject.wallet.entity.Wallet;
//import com.estsoft.springdemoproject.wallet.repository.WalletRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class WalletService {
//    @Autowired
//    private WalletFactoryService walletFactoryService;
//    @Autowired
//    private WalletRepository walletRepository;
//
//    public Wallet createCustomerWallet(String userId) {
//        CustomerWallet wallet = walletFactoryService.createCustomerWallet(userId);
//
//        Wallet result = walletRepository.save(wallet);
//
//        return result;
//    }
//
//    public Wallet createMerchantWallet(String userId) {
//        MerchantWallet wallet = walletFactoryService.createMerchantWallet(userId);
//
//        Wallet result = walletRepository.save(wallet);
//
//        return result;
//    }
//}