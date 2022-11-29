package org.example;

public class Wolf extends Animal implements WildAnimal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wolf "+getName()+"says : Hawo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + "goes hunting");
    }
}
