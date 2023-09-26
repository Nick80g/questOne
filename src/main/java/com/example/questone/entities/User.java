package com.example.questone.entities;

public class User {
    private String name;
    private int gameCount;

    public User() {
    }

    public User(String name, int gameCount) {
        this.name = name;
        this.gameCount = gameCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gameCount='" + gameCount + '\'' +
                '}';
    }
}