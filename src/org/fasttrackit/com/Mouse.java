package org.fasttrackit.com;

public class Mouse implements AnimalBehaves{
    private String name;

    public Mouse() {
        this.name = "Mouse";
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
