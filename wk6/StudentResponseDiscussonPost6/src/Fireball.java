/**
 * Course:  CMIS 242
 * Assignment:  Week 6 Discussion
 * @author Tom Hopkins
 * Date:  2/21/2021
 * Compiler:  Apache NetBeans 12.2
 */

import java.util.Random;

/**
 * This class represents the Fireball spell in the 2nd Edition
 * of the PathFinder RPG. It is a child of the Spell class
 */
public class Fireball extends Spell {
    
    /**
     * Constructor
     * @param level 
     */
    public Fireball(int level) {
        super(level, "Fireball", "A tiny ball of bat guano and sulfer");
        
        String description = "A blast of fire explodes in a 20-foot radius.\n" +
                "It deals 6d6 fire damage at 3rd level.\n" +
                "It deals an additional +2d6 damage for each additional level.\n";
    
        super.setSpellDescription(description);
    }   // End Constructor
    
    /**
     * Method that casts the spell
     * @return String describing calculated damage
     */
    @Override
    public String castSpell() {
        // Calls the parent castSpell method
        String spellResult = super.castSpell(); 
        
        // Building the result description
        // Includes calling method to calculate damage
        spellResult = spellResult + "It deals " + calculateDamage() + " fire damage.\n"; 
        
        return spellResult;
        
    }   // End castSpell

    /**
     * Method to calculate damage
     * @return calculated damage as int
     */
    @Override
    public int calculateDamage() {
        //Declare variables
    	
        Random rand = new Random();
        int sum = 0;
        
        // damage is 2d6 per level
        for (int i=1; i<= super.getSpellLevel(); i++) {
            sum = sum + rand.nextInt(6) + 1;
            sum = sum + rand.nextInt(6) + 1;
        }
        
        return sum;
    }   // End caclulateDamage
    
}   // End class