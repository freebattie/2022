package Tasks.mytasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Player variables
        String playerName ="HarryPotter";
        int playerHealth = 100;
        String spellName = "Fireball";
        int playerSpellDamage = 10;

        // Player Weapons variables
        String weaponName = "Sword";
        int weaponDamage = 20;

        // Enemy variables
        String enemyName1 ="Enemy1";
        int enemyHealth1 = 110;
        String spellName1 = "frostball";
        int enemySpellDamage1 = 3;

        //Enemy Weapons variables
        String weaponName1 = "Staff";
        int weaponDamage1 = 30;
        boolean useSpell1 = true; // brukt for å flipe mellom spell og weapon use på AI

        //Game variables
        boolean isGameOver = false;
        boolean playerTurn = true; // brukt for å skifta mellom spiller og AI


        //Game loop
        while (!isGameOver){

            if (playerHealth <= 0 || enemyHealth1 <= 0)
                isGameOver = true;

            else if (playerTurn){
                Scanner sc = new Scanner(System.in);
                System.out.println("Hi " + playerName);
                System.out.println("you have " + playerHealth +"hp");
                System.out.println("enemy has " + enemyHealth1 +"hp");
                System.out.println("select what to use");
                System.out.println("1 for " + spellName +  " dmg: " + playerSpellDamage);
                System.out.println("2 for " + weaponName + " dmg: " +weaponDamage  );
                System.out.printf("input : ");
                int action = Integer.parseInt(sc.nextLine());

                if (action == 1){
                    enemyHealth1-= playerSpellDamage;
                    // repiter for alle fiender du legger til
                }
                else if(action == 2){
                    enemyHealth1-= weaponDamage;
                    // repiter for alle fiender du legger til
                }
                playerTurn = false;

            }
            else{
                System.out.println(enemyName1 +" used:");
                if (useSpell1){
                    System.out.println(spellName1 +" and did "+enemySpellDamage1+ " dmg." );
                    playerHealth -= enemySpellDamage1;
                    useSpell1 =false;
                }
                else{
                    System.out.println(weaponName1 +" and did "+weaponDamage1+ " dmg." );
                    playerHealth-= weaponDamage1;
                    useSpell1 =true;
                }
                playerTurn = true;
            }
        }

        // hvis hvem som vant
        if (playerHealth <= 0){
            System.out.println("you Lost");
            System.out.println("Enemy had " + enemyHealth1+"hp left");
        }
        else{
            System.out.println("you Won");
            System.out.println("Enemy had " + enemyHealth1+"hp left");
        }

    }
}
