/**
 * Course:  CMIS 242
 * Assignment:  Week 6 Discussion
 * @author Tom Hopkins
 * Date:  2/21/2021
 * Compiler:  Apache NetBeans 12.2
 */

import java.util.Scanner;

/**
 * This class tests the Spell parent class and its children
 * the Fireball and LightningBolt classes.
 */
public class TestSpells {
	static Scanner scanIn = new Scanner(System.in);
    
    // Method to display the main menu options
    public static void displayMainMenu() {    
        System.out.println("Choose a spell from the following menu.");
        System.out.println("1 - Fireball");
        System.out.println("2 - Lightning Bolt");
        System.out.println("9 - Exit");
    }
    
    /**
     * Method to process getting the main menu choice
     * @return -1 if invalid, 1-Fireball, 2-Lightning Bolt, 9-Exit
     */
    public static int getMainMenuChoice() {
        // Calls method to display main menu
        displayMainMenu();
        
        // Declare variables
        int choice;
        
        // Checks if an integer was entered
        if(scanIn.hasNextInt() == false ) {
            System.out.println("Please enter a choice from the menu.\n");
            return -1;
        } else {
            choice = Integer.parseInt(scanIn.next());
            switch(choice) {
                case 1:
                case 2:
                case 9:
                    return choice;
                default:
                    System.out.println("Please enter a choice from the menu.\n");
                    return -1;
            }
        }   // End if-else
    }   // get main choice
    


    /**
     * Method to oversee the process of getting the level to cast the spell
     * @param spellName
     * @return 3 - 9
     */
    public static int getLevel(String spellName) {
        // Declare variables
        int choice = -1;
        
        do {
            System.out.println("At what level would you like to cast " + 
                    spellName + "?");
            System.out.println("Your choices are integer value 3 to 9.");

            choice = getLevelChoice();
        
        } while (choice == -1);
        
        return choice;
        
    }  // End getLevel
    
    /**
     * Method to the level to cast the spell at
     * @return -1 if invalid, 3-9 if valid
     */
    public static int getLevelChoice() {
        int choice;
        
        
        if(scanIn.hasNextInt() == false ) {
            System.out.println("Please enter a choice from the menu.\n");
            return -1;
        } else {
            choice = Integer.parseInt(scanIn.next());
            
            if (choice < 3 || choice > 9) {
                System.out.println("Enter a spell level from 3 - 9.\n");
                return -1;
            } else {
                return choice;
            } 
            
        }    // End if-else
    }   // End getLevelChoice
    
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Declare variables
        boolean isValid = false;
        int choice;
        int level;
        Spell theSpell;
        String[] spells = {"Fireball", "Lightning Bolt"};
        
        do {
            choice = getMainMenuChoice();
            
            switch(choice) {
                case -1:
                    break;
                case 1:
                   level = getLevel(spells[choice-1]);
                   theSpell = new Fireball(level);
                   System.out.println(theSpell.getSpellDescription());
                   System.out.println(theSpell.castSpell());
                   break;
                case 2:
                   level = getLevel(spells[choice-1]);
                   theSpell = new LightningBolt(level);
                   System.out.println(theSpell.getSpellDescription());
                   System.out.println(theSpell.castSpell());
                   break;
                case 9:
                    isValid = true;
                    break;
            }
            
        } while(isValid == false);
        
        scanIn.close();
        System.out.println("Goodbye.");
        
    }   // End Main
    
}   // End class