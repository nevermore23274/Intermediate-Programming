/**
 * Course:  CMIS 242
 * Assignment:  Week 6 Discussion
 * @author Tom Hopkins
 * Date:  2/21/2021
 * Compiler:  Apache NetBeans 12.2
 */

import java.util.Random;

/**
 * This class represents the Lightning Bolt spell in the 2nd Edition
 * of the PathFinder RPG. It is a child of the Spell class.
 */
public class LightningBolt extends Spell{
    
    /**
     * Constructor
     * @param level 
     */
    public LightningBolt(int level) {
        super(level, "Lightning Bolt", "A bit of fur, and a rod of amber");
        
        String description = "A bolt of lightning travels in a 120-foot line.\n" +
                "It deals 4d12 electricity damage at 3rd level.\n" +
                "It deals an additional +1d12 damage for each additional level.\n";
        
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
        spellResult = spellResult + "It deals " + calculateDamage() + 
                " electricity damage.\n"; 
        
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
        
        // damage is 4d12 at level 3 and +1d12 per level after that
        // which is the same as 1d12 plus 1d12 per level
        sum = sum + rand.nextInt(12) + 1;
        
        for (int i=1; i<= super.getSpellLevel(); i++) {
            sum = sum + rand.nextInt(12) + 1;
        }
        
        return sum;
    }   // End caclulateDamage
    
}   // End class