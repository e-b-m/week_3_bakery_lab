
public abstract class BakedGood {
    private String name;
    private int calories;
    private boolean hasGiftWrapping;
    private String boxSize;
    private boolean hasBox;

    public BakedGood(String name, int calories, boolean hasGiftWrapping) {
    }

    // METHODS





    public void addGiftWrapping() {
        hasGiftWrapping = true;
    }

    public void addBox() {
        hasBox = true;
        boxSize = "small";
    }

    public void addBox(String boxSize) {
        hasBox = true;
        this.boxSize = boxSize;
    }

    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = 0;
    }

    public boolean hasGiftWrapping() {
        return hasGiftWrapping;
    }

    public void setHasGiftWrapping(boolean hasGiftWrapping){
        hasGiftWrapping = true;
    }

}

