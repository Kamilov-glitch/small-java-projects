import java.util.Scanner;
import java.util.ArrayList;

public class CommandController {
    private Scanner scan;
    private ArrayList<Recipe> recipes;
    
   public CommandController() {
       this.scan = new Scanner(System.in);
       this.recipes = new ArrayList<>();
   }
   
   public void addRecipe(Recipe recipe) {
       this.recipes.add(recipe);
   }
   
   public void command(String command) {
       if (command.equals("list")) {
           System.out.println("Recipes:");
           this.printLines();
       }
       if (command.equals("find name")) {
           System.out.println("Searched word:");
           String word = scan.nextLine();
           System.out.println("Recipes:");
           System.out.println(this.searchByName(word));
           
       }
       if (command.equals("find cooking time")) {
           System.out.println("Max cooking time:");
           int time = scan.nextInt();
           System.out.println("Recipes:");
           this.searchLineByTime(time);
       }
       
       if (command.equals("find ingredient")) {
           System.out.println("Ingredient:");
           String ing = scan.nextLine();
           System.out.println("Recipes:");
           this.searchByIngredient(ing);
       }
   }
   
   public void printLines() {
       for (Recipe i : this.recipes) {
           System.out.println(i);
       }
   }
   
   public String searchByName(String word) {
       for (Recipe i : this.recipes) {
           if (i.getMeal().contains(word)) {
               return i.toString();
           }
       }
       return "Couldn't find " + word;
   }
   
   public void searchLineByTime(int time) {
       for (Recipe i : this.recipes) {
           if (i.getTime() <= time) {
               System.out.println(i);
           }
       }
   }
   
   public void searchByIngredient(String ingredient) {
       for (Recipe i : this.recipes) {
           if (i.getIngredients().contains(ingredient)) {
               System.out.println(i);
           }
       }
   }
   
}
