import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new
        Scanner(System.in);
        
    double total = 0;
    double maximum = Double.NEGATIVE_INFINITY;
    double minimum = Double.POSITIVE_INFINITY;
    for (int i= 1; i <= 10; i++){
        System.out.print("Enter grade " + i + ": ");
        double grade = input.nextDouble();
        total += grade;
        if (grade > maximum) {
            maximum = grade;

        }if (grade < minimum) {
            minimum = grade;
        }
    }
        double average = total/ 10;
    System.out.println("\nGrade Statistics:");
    System.out.println("Average grade; " + average);
    System.out.println("Maximum grade; " + maximum);
    System.out.println("Minimum grade; " + minimum);
    input.close();
}
}
