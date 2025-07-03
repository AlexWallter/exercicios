package com.test.demo.model;

public class User {
    private String login;
    private String passwor;
    
    public User(String login, String passwor) {
        this.login = login;
        this.passwor = passwor;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPasswor() {
        return passwor;
    }
    public void setPasswor(String passwor) {
        this.passwor = passwor;
    }
    
    @Override
    public String toString() {
        return "User [login=" + login + ", passwor=" + passwor + "]";
    }
}
