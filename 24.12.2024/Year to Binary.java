import java.util.Scanner;

public class YearToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Binary representation: " + Integer.toBinaryString(year));
    }
}
