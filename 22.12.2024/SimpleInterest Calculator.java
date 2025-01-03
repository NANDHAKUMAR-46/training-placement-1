import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount, rate (%), and time (years):");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
