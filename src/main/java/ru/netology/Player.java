package ru.netology;

public class Player {

    protected int id;
    protected int strength;
    protected String name;

    public Player(int id, int strength, String name) {
        this.id = id;
        this.strength = strength;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}
