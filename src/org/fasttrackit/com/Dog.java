package org.fasttrackit.com;

public class Dog implements AnimalBehaves{
    private String name;

    public Dog() {
        this.name = "Dog";
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
        return this.name + "-talking";
    }
}

