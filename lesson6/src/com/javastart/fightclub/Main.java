package com.javastart.fightclub;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat();

        loriCat.setName("Lori");
        loriCat.setWeight(3);

        Cat baxter = new Cat();

        baxter.setName("Baxter");
        baxter.setWeight(5);

        FightClub fightClub = new FightClub();
        String winnerName = fightClub.fight(loriCat, baxter);
        System.out.println("Winner: " + winnerName);

        loriCat.setWeight(8);
        String winner2Name = fightClub.fight(loriCat, baxter);
        System.out.println("Winner: " + winner2Name);
    }
}
