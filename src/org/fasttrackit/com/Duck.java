package org.fasttrackit.com;

public class Duck implements AnimalBehaves{
    private String name;

    public Duck () {
        this.name = "Duck";
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
