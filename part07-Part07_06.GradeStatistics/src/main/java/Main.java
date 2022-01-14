
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade points = new Grade();
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            int point = scanner.nextInt();
            if (point == -1) {
                break;
            }
            
            if (point > 100 || point < 0) {
                continue;
            }
            
            points.addPoint(point);
        }
        System.out.println("Point average (all): " + points.pointsAverage());
        System.out.println("Point average (passing): " + points.passingPointsAverage());
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution:");
        points.gradeDistribution();
        points.printStar();
    }
}
