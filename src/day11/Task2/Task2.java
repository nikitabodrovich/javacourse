package day11.Task2;

public class Task2 {
    public static void main(String[] args) {
       Warrior war = new Warrior();
       Paladin pal = new Paladin();
       Shaman sham = new Shaman();
       Magician mage = new Magician();
        war.physicalAttack(pal);
        System.out.println(pal);

        pal.physicalAttack(mage);
        System.out.println(mage);

        sham.healTeammate(mage);
        System.out.println(mage);

        mage.magicalAttack(pal);
        System.out.println(pal);

        sham.physicalAttack(war);
        System.out.println(war);

        pal.healHimself();
        System.out.println(pal);
        for (int i = 0; i<5; i++){
            war.physicalAttack(mage);
            System.out.println(mage);
        }
    }
}
