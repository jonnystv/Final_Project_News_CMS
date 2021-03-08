package com.example.codeclan.newscmsserver.models;

public enum UserType {

    ADMINISTRATOR ("Administrator"),
    EDITOR ("Editor"),
    CONTRIBUTOR ("Contributor"),
    READER ("Reader");

    private final String type;
    UserType(String type) {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}
