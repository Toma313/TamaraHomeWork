package org.example;

public abstract class Animal {
    private String name;
    private String greets;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreets() {
        return greets;
    }

    public void setGreets(String greets) {
        this.greets = greets;
    }

    public Animal(String name, String greets) {
        this.name = name;
        this.greets = greets;
    }

    abstract void greets();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}

