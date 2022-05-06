public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */

    Character(){
        System.out.println("......................");
        System.out.println(">> Both characters are ready <<");
        System.out.println("-------- BATTLE BEGINS -------- ");
        System.out.println("......................");
    }

    Character(String Name, int Lvl, int Hp, int Mp){
        characterName = Name;
        level = Lvl;
        healthPoints = Hp;
        manaPoints = Mp;
    }

    /**
     * Create a Method that displays the Name of the Character
     * e.g. "Character Initialized : Gandalf"
     */
    public void charName(Character Player){
        System.out.println("......................");
        System.out.println("Character Initialized : " +Player.characterName);
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character Enemy,int damagePoints, Character Player, int manaCost){

        /**
         * Deduct health points from enemy character
         */
        Enemy.healthPoints -= damagePoints;

        if(Enemy.healthPoints > 0) {
            System.out.println("Enemy character HP Left = " + Enemy.healthPoints);
        } else{
            System.out.println("Enemy character HP Left = 0");
        }

        /**
         * Deduct health points from current character
         */
        Player.manaPoints -= manaCost;

        /**
         * Prompt Character is defeated if HP falls below 0
         * e.g. Character Shaman defeated.
         */

        if(Enemy.healthPoints <= 0){
            System.out.println("......................");
            System.out.println("-------- BATTLE ENDED -------- ");
            System.out.println(Player.characterName + "'s HP = " + Player.healthPoints);
            System.out.println(Enemy.characterName + "'s HP = 0");
            System.out.println(Enemy.characterName + " is DEFEATED");
            System.out.println("......................");
        }
    }

    /**
     * Method to level up the winner
     */
    public void LvlUp(Character Player, Character Enemy){
        System.out.println("Congratulations " +Player.characterName + " !! Your level INCREASED !!");
        Player.level += 10;
        System.out.println(Player.characterName + " = " + Player.level + " lvl");
        System.out.println(Enemy.characterName + " = " + Enemy.level + " lvl");
    }
}