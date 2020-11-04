import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter length of password:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println(Password.generate(length));
    }
