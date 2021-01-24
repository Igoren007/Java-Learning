package com.javastart.fightclub;

public class FightClub {
    public String fight(Cat firstCat, Cat secondCat) {
        int firstCatWeight = firstCat.getWeight();
        int secondCatWeight = secondCat.getWeight();

        if (firstCatWeight > secondCatWeight) {
            return firstCat.getName();
        } else {
            return secondCat.getName();
        }
    }
}
