package org.fasttrackit.com;

public class Cat implements AnimalBehaves{

    private String name;

    public Cat() {
        this.name = "Cat";
    }


    @Override
    public String walk() {
        return this.name + "-walking";
    }

    @Override
    public String talk() {
        return this.name + "-talking";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }
}
