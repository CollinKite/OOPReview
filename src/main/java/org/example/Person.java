package org.example;

//Can Implement MANY interfaces and override the methods
public class Person implements Hands, Food{
    private int health = 100;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void eat() {
        setHealth(getHealth() + 10);
    }

    @Override
    public void devour() {
        setHealth(getHealth() + 5);

    }

    @Override
    public void punch() {
        System.out.println("whoosh");
    }

    @Override
    public void choke() {
        System.out.println("Opponent killed!");
    }
}
