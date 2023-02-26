// Создать класс щита, разработать разные типы щитов, добавить в семейство
// классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
// Добавить метод определения минимального щита в команде.

import Shields.Buckler;
import Weapons.Bow;
import Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Иван", 100, new Sword(30)))
                .addWarriorToTeam(new Swordman("Владиимир", 120, new Sword(60), new Buckler(40, 100)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Илья", 80, new Bow(45, 30)))
                .addWarriorToTeam(new Archer("Добрыня", 150, new Bow(65, 45)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
        System.out.println(team1.minArmor());
    }


}