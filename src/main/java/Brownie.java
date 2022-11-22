import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Brownie extends BakedGood {
    private ArrayList<String> brownieFilling;


    public Brownie(String name, int calories, boolean hasGiftWrapping, ArrayList<String> brownieFilling) {
        super(name, calories, hasGiftWrapping);
        this.brownieFilling = brownieFilling;
    }

    // GETTERS & SETTERS

    public ArrayList<String> getBrownieFillings(){
        return getBrownieFillings();
    }

    public void setBrownieFilling (ArrayList<String> brownieFilling){
        this.brownieFilling = brownieFilling;
    }
}
