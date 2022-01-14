
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String input = scanner.nextLine();
        CommandController cc = new CommandController();
        try (Scanner fr = new Scanner(Paths.get(input))) {
            
            while (fr.hasNextLine()) {
                String recipes = "";
                while (fr.hasNextLine()) {
                    String recipeText = fr.nextLine();
                    if (!recipeText.isEmpty()) {
                        recipes = recipes + recipeText + ",";
                    } else {
                        break;
                    }
                }
                Recipe recipe = new Recipe();
                recipe.addRecipe(recipes);
                cc.addRecipe(recipe);
            }
            System.out.println("Commands:");
            while (true) {
                System.out.println("Enter command:");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }
                cc.command(command);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        
    }

}
