package org.example;

public class Main {
    public static void main(String[] args) {
        //Inheritance
        Animal a = new Animal();
        a.method(); //Calling our inheritated method
        a.Attribute = "s"; //updating our inheritated method
        //Polymorphism
        Polymorphism p = new Polymorphism();
        p.sound();
        //Polymorph classes with overridden method
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
    }
}