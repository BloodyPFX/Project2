//programmer: Bailey <3 (lukas added weapon array)
//ask if enum could be used for variables like armor protection(defense)
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class characterVariables {
    private Double health;
    private Double stamina;
    private int food;
    private Double currency;
    private int armor;

    private int inventorySlots; //private int inventorySlots //can't carry more than 20lbs

    private weapons currentEquip;
    private static ArrayList<item> inventory;

    //can't carry more than 20lbs
    public static ArrayList<foods> foodInv;// = new ArrayList<String>();
    private static ArrayList<weapons> weaponInv;// = new ArrayList<String>();
    //private ArrayList<weapons> weaponsInv; //backpack backpack

    //private weapons mainweapon;

    //   O      <-health, stamina, food, currency, 
    //  /|\     <-weapons, armor
    //  /\      <-boosts (potions) 
    
    //constructor

    public characterVariables(Double hpt, Double std, int fuk, Double cun, int lon, int dik, int pen, int arm, int invs,String type){
        health = hpt; stamina = std; food = fuk; currency = cun; armor = arm; inventorySlots = invs;
        foodInv = new ArrayList<foods>();
        weaponInv = new ArrayList<weapons>();
        inventory = new ArrayList<item>();
        startupsetup(type); //barbarian, rogue, mage
    }
    // longsword = lon; dagger = dik; pocketKnife = pen;

    //get methods
    public Double getHealth(){return health;}

    public Double getStamina(){return stamina;}

    public int getFood(){return food;}

    public Double getCurrency(){return currency;}

    public int getArmor(){return armor;}

    public int getInventorySlots(){return inventorySlots;}

    //set methods
    public void setHealth(Double hpt){health = hpt;}

    public void setStamina(Double std){stamina = std;}

    public void setFood(int fuk){food = fuk;}

    public void setCurrency(Double cun){currency = cun;}

    public void setArmor(int arm){armor = arm;}

    public void setInventorySlots(int invs){inventorySlots = invs;}
    
    //behaviors
    //do damage; chance to miss
    public int doDam(){
        Random ran = new Random();
        int temp = ran.nextInt(3);
        if (temp % 3 != 0)
            return 1; 
        //daamagedealt =mainweapon.getdamage+bonuspotions.boostdamage+base_character_damage;
        return 0;

    }
    
    public static void startupsetup (String type){
        foods cookedChicken = new foods("cooked chicken", 20, 50, 0);
        add2Inv(cookedChicken);

        foods bread = new foods("bread", 5, 20, 0);
        add2Inv(bread);

        foods cookie = new foods("cookie", 10, 30, 0);
        add2Inv(cookie);

        foods muffin = new foods("muffin", 10, 30, 0);
        add2Inv(muffin);

        foods pickle = new foods("pickle", 5, 15, 0);
        add2Inv(pickle);

        foods staminaPotion = new foods("stamina potion", 25, 0, 50);
        add2Inv(staminaPotion);

        foods healthPotion = new foods("health potion", 25, 80, 0);
        add2Inv(healthPotion);

        if(type.equals("Rogue")){
            weapons knife = new weapons(10, 10, 10, 100, "nife");
            add2Inv(knife);
        }
        else if (type.equals("barbarian")){

            

            weapons longsword = new weapons(30, 20, 20, 25, "longsword" );
            add2Inv(longsword);
            
            weapons dagger = new weapons(20, 15, 10, 10, "dagger");
            add2Inv(dagger);
    
            weapons pocketknife = new weapons(15, 10, 5, 5, "pocketknife");
            add2Inv(pocketknife);
    
            weapons damagePotion = new weapons(70, 30, 0, 1, "damage potion");
            add2Inv(damagePotion);    
        }
        else if (type.equals("mage")){
            weapons staff = new weapons(10, 10, 10, 100, "staff");
            add2Inv(staff);
        }     
        
    }
    
        //FOODINVETORY PRINT OUT BULLSHIT
    public static void printFoodInv(){
        for(foods f: foodInv){
            System.out.println(f.getName());
        }
    }



    public static void add2Inv(item i){
        inventory.add(i);
        if(i instanceof weapons){
            weaponInv.add((weapons) i);

        }
        if(i instanceof foods){
            foodInv.add((foods) i);
        }  

        //if (currentEquip == null){
        //    currentEquip = i;
        //}
        //if(i.getClass() == //weapon){
        //    weaponsInv.add(i);
        //}
    }

    public int getDamage(){
        int equipDamage = currentEquip.getDamage();
        int baseDamage = 1;

        return (baseDamage + equipDamage)*doDam();
        
    }
        //take damage 
            //how much damage with/without armor
            //how much damage with/without potions
        //give damage
            //how much damage depending on weapons
            //how much damage depending on boosts

    //picking weapon
        //setting one weapon as the main weapon
        //this allows the character to change a weapon depending on the "boss"
    
    //fallInLove()
        //allows the character to do random actions that may or may not help them
    
    //dieOfStarvation()
        //if hunger is to high, character must die
    
    //dieOfPoverty()
        //if the character has no money, the dragons should eat the player for not being able to pay taxes

    //dieOfOverweight()
        //if they have too many things in inventory they DIE
        //if there are no inventory slots then they can't add more items to their inventory so they can't "die"
        

        public static void add2health (int y){
            //health += y
            
            //characterVariables.;
        }
}
