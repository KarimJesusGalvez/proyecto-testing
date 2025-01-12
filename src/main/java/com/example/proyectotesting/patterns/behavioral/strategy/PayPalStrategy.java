package com.example.proyectotesting.patterns.behavioral.strategy;

/**
 * Credit card payment option
 */
public class PayPalStrategy implements PaymentStrategy{

    private String api;
    private String user;
    private String token;

    public PayPalStrategy(String api, String user, String token) {
        this.api = api;
        this.user = user;
        this.token = token;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    /**
     * Prints the payment of the provided amount
     */
    public void pay(double amount) {

    }
}
