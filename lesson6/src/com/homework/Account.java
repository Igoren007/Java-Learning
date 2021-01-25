package com.homework;

public class Account {
    private Bill bill;
    private Person person;

    public Account(Bill bill, Person person) {
        this.bill = bill;
        this.person = person;
    }

    public Person getAccountPerson() {
        return person;
    }

    public void setAccountPerson(Person person) {
        this.person = person;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
