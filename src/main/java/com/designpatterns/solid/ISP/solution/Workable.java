package com.designpatterns.solid.ISP.solution;
/*
* Definition: A class should not be forced to implement methods it does not use.
Problem: The Robot class is forced to implement eat(), which is irrelevant.
 * */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    public void work() {
        // Robot working logic
    }
}

class Human implements Workable, Eatable {
    public void work() {
        // Human working logic
    }

    public void eat() {
        // Human eating logic
    }
}
