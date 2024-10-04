package com.estsoft.springdemoproject.ioc;

public class Member {
    private int id;
    private String name;
    private String address;

    public Member(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
