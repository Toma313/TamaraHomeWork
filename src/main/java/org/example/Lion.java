package org.example;

public class Lion extends Animal implements WildAnimal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Loin "+ getName()+ " says: Roar");
    }
    @Override
    public void hunting(){
        System.out.println("Loin "+ getName()+ " goes hunting");
    };


}
