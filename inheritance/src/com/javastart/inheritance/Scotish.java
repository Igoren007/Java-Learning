package com.javastart.inheritance;

public class Scotish extends Cat {
    private String name;
    public Scotish(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age:" + getAge() + " Owner: " + getOwner();
    }
}
