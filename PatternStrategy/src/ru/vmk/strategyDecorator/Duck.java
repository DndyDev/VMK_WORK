package ru.vmk.strategyDecorator;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim() {
        System.out.println("Duck swim");
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
