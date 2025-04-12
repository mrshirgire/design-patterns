package com.designpatterns.structural.decorator;

interface Coffee {
    double cost();
}

class SimpleCoffee implements Coffee {
    public double cost() { return 5; }
}

// Decorator to add extra functionality
class MilkDecorator implements Coffee {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) { this.coffee = coffee; }

    public double cost() { return coffee.cost() + 2; } // Adds milk cost
}

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.cost()); // Cost: $5

        // Adding Milk (Composition)
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + coffee.cost()); // Cost: $7
    }
}
