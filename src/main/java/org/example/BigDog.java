package org.example;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog dof) {
        System.out.println("Wooow");
    }
    void greets (BigDog bigDog){
        System.out.println("Wooooooooooooow");
    }
}
