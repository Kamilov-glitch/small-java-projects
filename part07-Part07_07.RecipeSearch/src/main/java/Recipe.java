import java.util.ArrayList;

public class Recipe {
    private String meal;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe() {
        this.meal = "";
        this.time = 0;
        this.ingredients = new ArrayList<>();
    }
    
    public String getMeal() {
        return this.meal;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public void addRecipe(String input) {
        String[] parts = input.split(",");
        this.meal = parts[0];
        this.time = Integer.valueOf(parts[1]);
        for (int i = 2; i < parts.length; i++) {
            this.ingredients.add(parts[i]);
        }
    }
    
    @Override
    public String toString() {
        return (this.meal + ", cooking time: " + this.time);
    }
}
