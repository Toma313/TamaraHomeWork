package org.example;

import java.lang.reflect.Method;

public class Utils {
    public static void main(String[] args) {
        Cat cat = new Cat("Bagira");
        BigDog bigDog = new BigDog("Pit");
        bigDog.greets();
        bigDog.greets(new BigDog("Arrr"));
        cat.walk(new Cat("Black"));
        Lion lion = new Lion("Leo");
        lion.hunting();
    }



    public static void Method(Pet pet) {
        pet.walk();

    }
}

