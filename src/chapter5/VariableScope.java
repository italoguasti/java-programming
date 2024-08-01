package chapter5;

import java.util.Scanner;

public class VariableScope {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize what we know

        // Get what we dont know
        double salary = getSalary();
        int credScore = getCreditScore();
        scanner.close();
        
        // Check if the user is qualified
        boolean qualified = isUserQualified(credScore, salary);
        
        // Notify the user
        notifyUser(qualified);
    }
    
    public static double getSalary() {
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        double salary = scanner.nextDouble();
        return salary;
    }
    
    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }
        return false;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Sorry. You've been declined.");
        }
    }
}
