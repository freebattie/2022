package Tasks.mytasks;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {

        String playerName ="HarryPotter";
        int playerHealth = 100;
        String spellName = "Fireball";
        int playerSpellDamage = 10;

        // Player Weapons variables
        String weaponName = "Sword";
        int weaponDamage = 20;

        Enemy enemy1 = new Enemy();

        boolean isGameOver =false;
        boolean playerTurn = true;

        while (!isGameOver){

            if (playerHealth <= 0 || enemy1.health <= 0)
                isGameOver = true;

            else if (playerTurn){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hi " + playerName);
                System.out.println("you have " + playerHealth +"hp");
                System.out.println("enemy has " + enemy1.health +"hp");
                System.out.println("select what to use");
                System.out.println("1 for " + spellName +  " dmg: " + playerSpellDamage);
                System.out.println("2 for " + weaponName + " dmg: " +weaponDamage  );
                System.out.printf("input : ");
                int action = Integer.parseInt(sc.nextLine());

                if (action == 1){
                    enemy1.health -= playerSpellDamage;
                    // repiter for alle fiender du legger til
                }
                else if(action == 2){
                    enemy1.health -= weaponDamage;
                    // repiter for alle fiender du legger til
                }
                playerTurn = false;

            }
            else{
                System.out.println(enemy1.name +" used:");
                if (enemy1.useSpell){
                    System.out.println(enemy1.spellName +" and did "+enemy1.spellDamage + " dmg." );
                    playerHealth -= enemy1.spellDamage;
                    enemy1.useSpell =false;
                }
                else{
                    System.out.println(enemy1.weaponName +" and did "+enemy1.weaponDamage+ " dmg." );
                    playerHealth-= enemy1.weaponDamage;
                    enemy1.useSpell =true;
                }
                playerTurn = true;
            }
        }

        // hvis hvem som vant
        if (playerHealth <= 0){
            System.out.println("you Lost");
            System.out.println("Enemy had " + enemy1.health +"hp left");
        }
        else{
            System.out.println("you Won");
            System.out.println("Enemy had " + enemy1.health +"hp left");
        }
    }
}
