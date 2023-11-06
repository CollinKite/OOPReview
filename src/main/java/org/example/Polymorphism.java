package org.example;

public class Polymorphism {
    void sound()
    {
        System.out.println("make noise");
    }
}

class Dog extends Polymorphism {
    @Override
    void sound(){
        System.out.println("Dog goes bark");
    }
}

class Cat extends Polymorphism {
    @Override
    void sound(){
        System.out.println("cat goes meow");
    }
}
