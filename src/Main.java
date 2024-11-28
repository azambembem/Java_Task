import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~12gacha bulgan sonni kiriting:");
        int month = scanner.nextInt();

        if (month == 1) {
            System.out.println("YAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MART");
        } else if (month == 4) {
            System.out.println("APREL");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("IYUN");
        } else if (month == 7) {
            System.out.println("IYUL");
        } else if (month == 8) {
            System.out.println("AVG");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("notogri raqam kiritikgan: ");
        }
        scanner.close();
        }
    };