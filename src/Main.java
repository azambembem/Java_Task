import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-sonni kiriting:");
        int num1 = scanner.nextInt();
        System.out.println("2-sonni kiriting:");
        int num2 = scanner.nextInt();
        int farq;

        if (num1 > num2) {
            farq = num1 - num2;
        } else {
            farq = num2 - num1;
        }
        System.out.println("kiritilgan sonnlarni farqi" +farq);
        scanner.close();
        }
    };