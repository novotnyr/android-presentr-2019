package com.github.novotnyr.android.presentr;

public class User {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return this.login;
    }
}
