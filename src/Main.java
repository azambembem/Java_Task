import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-sonni kiriting:");
        int num1 = scanner.nextInt();
        System.out.println("2-sonni kiriting:");
        int num2 = scanner.nextInt();
        System.out.println("3-sonni kiriting:");
        int num3 = scanner.nextInt();
        System.out.println("4-sonni kiriting:");
        int num4 = scanner.nextInt();
        System.out.println("5-sonni kiriting:");
        int num5 = scanner.nextInt();
        int maxVal = num1;

        if (num2 > maxVal) maxVal = num2;
        if (num3 > maxVal) maxVal = num3;
        if (num4 > maxVal) maxVal = num4;
        if (num5 > maxVal) maxVal = num5;

        int minVal = num1;
        if( num2 < minVal) minVal = num2;
        if (num3 < minVal) minVal = num3;
        if (num4 < minVal) minVal = num4;
        if (num5 < minVal) minVal = num5;

        System.out.println("kiritilgan sonnlarni max xi" +maxVal);
        System.out.println("kiritilgan sonlarni min ni" +minVal);
        scanner.close();
        }
    };