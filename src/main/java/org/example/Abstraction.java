package org.example;

abstract class Abstraction {
    abstract double area();
}

//Can only extend one class at time
class Circle extends Abstraction{
    double radius;

    @Override
    double area() {
        return 3.14 * (radius * radius);
    }
}

class Square extends Abstraction {
    double sideLength;

    @Override
    double area() {
        return sideLength * 2;
    }
}
