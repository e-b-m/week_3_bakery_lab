import java.sql.Array;
import java.util.ArrayList;

public class Cake extends BakedGood {

    private int numberOfTiers;
    private ArrayList<String> tierFlavours;

    public Cake(String name, int calories, boolean hasGiftWrapping, int number0fTiers, ArrayList<String> tierFlavours) {
        super(name, calories, hasGiftWrapping);
        this.numberOfTiers = number0fTiers;
        this.tierFlavours =  tierFlavours;
    }

    public Cake() {
        super("Red Velvet", 1000, true);
        this.numberOfTiers = 3;
    }



    // GETTERS & SETTERS

    public int getNumberOfTiers(){
        return numberOfTiers;
    }

    public void setNumberOfTiers(int numberOfTiers){
        this.numberOfTiers = numberOfTiers;
    }

    public ArrayList<String> getTierFlavours (){
        return tierFlavours;
    }

    public void setTierFlavours (ArrayList<String> tierFlavours){
        this.tierFlavours = tierFlavours;
    }

 }