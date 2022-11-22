public class Cupcake extends BakedGood {

private String icingColour;
private String icingFlavour;


    public Cupcake(String name, int calories, boolean hasGiftWrapping, String icingColour, String icingFlavour) {
        super(name, calories, hasGiftWrapping);
        this.icingColour = icingColour;
        this.icingFlavour = icingFlavour;

    }

    // GETTERS & SETTERS

    public String getIcingColour(){
        return icingColour;
    }

    public void setIcingColour(String icingColour){
        this.icingColour = icingColour;
    }

    public String getIcingFlavour(){
        return icingFlavour;
    }

    public void setIcingFlavour(String icingFlavour){
        this.icingFlavour = icingFlavour;
    }
}

