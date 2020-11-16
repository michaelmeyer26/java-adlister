package com.codeup.adlister.controllers;

class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUser() {
        return "adlister_user";
    }
    public String getPassword() {
        return "P4$5PyTT@hT7";
    }
}