//package com.estsoft.springdemoproject.wallet.service;
//
//import com.estsoft.springdemoproject.wallet.entity.*;
//import org.springframework.stereotype.Service;
//
//@Service
//public class WalletFactoryService {
//    public CustomerWallet createCustomerWallet(String userId) {
//        CustomerWallet customerWallet = new CustomerWallet(userId);
//        customerWallet.createAccount(new Account(customerWallet, AccountType.CASHBACK, true));
//        customerWallet.createAccount(new Account(customerWallet, AccountType.PREPAID, true));
//        customerWallet.createAccount(new Account(customerWallet, AccountType.EMONEY, true));
//        return customerWallet;
//    }
//
//    public MerchantWallet createMerchantWallet(String userId) {
//        MerchantWallet merchantWallet = new MerchantWallet(userId);
//        merchantWallet.createAccount(new Account(merchantWallet, AccountType.EMONEY, true));
//        return merchantWallet;
//    }
//}
