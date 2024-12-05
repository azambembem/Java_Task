//1) 1. 1 dan 100 orasidagi berilgan ixtiyoriy sonni so’z ko’rinishida chiqaradigan funksiya yordamida dastur tuzing.
//        (100 bu oraliqga kirmaydi).
//        Masalan: 22 -> yigirma ikki, 30 -> o’ttiz

import java.util.Scanner;

public class NumberToWords {
    public static String numberToWords(int n) {
        String[] units = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};

        if (n < 1 || n >= 10) {
            return "Faqat 1 dan 9 gacha bo'lgan sonlarni kiriting.";
        } else if (n < 10) {
            return units[n];
        } else {
            return "bunaqa son yuq";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 9 orasida biror son kiriting: ");
        int number = scanner.nextInt();
        System.out.println(numberToWords(number));
        scanner.close();
    }
}
