
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int loses = 0;
        try( Scanner fr = new Scanner(Paths.get(file)) ) {
            while (fr.hasNextLine()) {
                String row = fr.nextLine();
                String[] parts = row.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int goals1 = Integer.valueOf(parts[2]);
                int goals2 = Integer.valueOf(parts[3]);
                if (team1.equals(team)) {
                    games++;
                    if (goals1 > goals2) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
                if (team2.equals(team)) {
                    games++;
                    if (goals1 < goals2) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    }

}
