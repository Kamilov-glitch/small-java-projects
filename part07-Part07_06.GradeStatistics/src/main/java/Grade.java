import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    
    public Grade() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }
    
    public void addPoint(int point) {
        this.points.add(point);
    }
    
    public int sumOfPoints() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum;
    }
    
    public double pointsAverage() {
        return this.sumOfPoints() * 1.0 / this.points.size();
    }
    
    public double passingPointsAverage() {
        int count = 0;
        int passingSum = 0;
        for (int i : this.points) {
            if (i >= 50) {
                passingSum += i;
                count++;
            }
        }
        return passingSum * 1.0/ count;
    }
    
    public double passPercentage() {
        int passing = 0;
        for (int i : this.points) {
            if (i >= 50) {
                passing++;
            }
        }
        return passing * 100.0 / points.size();
    }
    
    public void gradeDistribution() {
        for (int i : this.points) {
            if (i < 50) {
                this.grades.add(0);
            } else if (i < 60) {
                this.grades.add(1);
            } else if (i < 70) {
                this.grades.add(2);
            } else if (i < 80) {
                this.grades.add(3);
            } else if (i < 90) {
                this.grades.add(4);
            } else if (i >= 90) {
                this.grades.add(5);
            }
        }
    }
    
    public void printStar() {
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (int i : this.grades) {
                if (i==grade) {
                    System.out.print("*");
                }
            }
            System.out.println("");
            grade--;
        }
        
    }
    
}
