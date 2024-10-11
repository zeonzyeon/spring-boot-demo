//package com.estsoft.springdemoproject.wallet.entity;
//
//import jakarta.persistence.*;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@MappedSuperclass
//public class WalletEntityObject {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Version
//    private int version;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private Date updatedAt;
//
//    @Column(columnDefinition = "TEXT")
//    @Convert(converter = WalletMapConverter.class)
//    private Map<String, String> metadata = new HashMap<>();
//}
