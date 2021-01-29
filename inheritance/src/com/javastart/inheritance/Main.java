package com.javastart.inheritance;

public class Main {
    public static void main(String[] args) {
        British jonny = new British(5, "Bob", "Jonny");
        Scotish alex = new Scotish(2, "Bond", "Alex");

        alex.sayMeow();
        jonny.sayMeow();

        System.out.println("Name: " + jonny.getName() + " Age:" + jonny.getAge() + " Owner: " + jonny.getOwner());
        System.out.println("Name: " + alex.getName() + " Age:" + alex.getAge() + " Owner: " + alex.getOwner());

        System.out.println(alex.toString());
        System.out.println(jonny.toString());
    }
}
