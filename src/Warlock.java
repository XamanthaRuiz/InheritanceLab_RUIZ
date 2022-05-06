public class Warlock extends Character{
    Warlock(String Name, int Lvl, int Hp, int Mp){
        super(Name, Lvl, Hp, Mp);
    }

    public void goldenHook(Character Enemy, Character Player){
        System.out.println(super.characterName + " hooked " + Enemy.characterName + " with Golden Hook");
        System.out.println(" >> 40 Damage >>");
        System.out.println(" << Minus 30 MP << ");
        int damagePoints = 40;
        int manaCost = 30;
        damageTarget(Enemy, damagePoints,Player,manaCost);
    }

    public void bloodyHunt(Character Enemy,Character Player){
        System.out.println(super.characterName + " used its ultimate!");
        System.out.println(" >> 50 Damage >>");
        System.out.println(" << Minus 50 MP << ");
        int damagePoints = 50;
        int manaCost = 50;
        damageTarget(Enemy, damagePoints, Player, manaCost);
    }

    public void healingBoots(){
        super.healthPoints += 30;
        super.manaPoints += 30;
        System.out.println(super.characterName + "Healed Gains +30HP +30MP!");
    }

    public void display(){
        System.out.println("......................");
        System.out.println("!! Player Details !!");
        System.out.println("Warlock: " +super.characterName);
        System.out.println("HP: " +super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
        System.out.println("......................");
    }
}