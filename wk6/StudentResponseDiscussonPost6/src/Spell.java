/**
 * Course:  CMIS 242
 * Assignment:  Week 6 Discussion
 * @author Tom Hopkins
 * Date:  2/21/2021
 * Compiler:  Apache NetBeans 12.2
 */

/**
 * This class represents a basic spell
 */
public class Spell {
    // Declare variables
    private int spellLevel;
    private String spellName;
    private String spellDescription;
    private String spellComponents;
    
    /**
     * Constructor
     * @param level 
     */
    public Spell(int level, String name, String components) {
        spellLevel = level;
        spellName = name;
        spellComponents = components;
    }
    
    public String castSpell() {
        
        return "You have cast " + spellName + " as a level " 
                + spellLevel + " spell, and use the following components: " + spellComponents + "\n";
    }   // End breathWeapon
    
    public int getSpellLevel() {
        return spellLevel;
    }
    
    public String getSpellDescription() {
        return spellDescription;
    }
    
    public String getSpellComponents() {
    	return spellComponents;
    }
    
    public void setSpellDescription(String description) {
        spellDescription = description;
    }
 
    public int calculateDamage() {
        return spellLevel;
    }
    
}   // End class