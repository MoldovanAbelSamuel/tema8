package org.fasttrackit.com;

public class Chicken implements AnimalBehaves{
    private String name;

    public Chicken() {
        this.name = "Chicken";
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
