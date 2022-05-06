public class Wizard extends Character{
    Wizard(String Name, int Lvl, int Hp, int Mp){
        super(Name, Lvl , Hp , Mp);
    }

    public void magicGloom(Character Enemy, Character Player){
        System.out.println(super.characterName + " attacked " + Enemy.characterName + " with Magic Gloom");
        System.out.println(" >> 40 Damage >>");
        System.out.println(" << Minus 30 MP << ");
        int damagePoints = 40;
        int manaCost = 30;
        damageTarget(Enemy, damagePoints, Player, manaCost);
    }

    public void shadowSpirit(Character enemyCharacter,Character Player){
        System.out.println(super.characterName + " used its ultimate!");
        System.out.println(" >> 60 Damage >>");
        System.out.println(" << Minus 50 MP << ");
        int damagePoints = 60;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints,Player,manaCost);
    }

    public void healingShoes(){
        super.healthPoints += 40;
        super.manaPoints += 30;
        System.out.println(super.characterName + " Gains +40HP +30MP!");
    }

    public void display(){
        System.out.println("......................");
        System.out.println("!! Player Details !!");
        System.out.println("Wizard: " +super.characterName);
        System.out.println("HP: " +super.healthPoints);
        System.out.println("MP: " + super.manaPoints);
        System.out.println("Level: " + super.level);
        System.out.println("......................");
    }
}
