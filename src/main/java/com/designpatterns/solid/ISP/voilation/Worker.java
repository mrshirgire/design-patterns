package com.designpatterns.solid.ISP.voilation;

interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        // Robot working logic
    }

    public void eat() {
        // Robots don’t eat, so this method is irrelevant
        throw new UnsupportedOperationException("Robots do not eat");
    }
}
