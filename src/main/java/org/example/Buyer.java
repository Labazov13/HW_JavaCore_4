package org.example;

public class Buyer {
    String name;

    public Buyer(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name + '\'';
    }
}
