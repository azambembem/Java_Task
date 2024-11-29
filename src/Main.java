//1) ekrandan 3 ta double son kiritb oling va ularni yig'indisini
//ayirmasini, ko'paytmasini va bo'linmasini shuningdek
//	1-songa 2-sonni qo'shilganining 3-songa bo'lgandagi qoldig'ini
//ekranga tushunarlik qilib chiqaring yani maksimal diyan qulay va tushunarlik
//bo'lsin
//

import java.util.Scanner;
public  class Main {
    public static void main (String [] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("1-sonni kiriting");
       double a = scanner.nextDouble();
       System.out.print("2-sonni kiriting");
       double b = scanner.nextDouble();
       System.out.print("3-sonni kiriting");
       double c = scanner.nextDouble();

       double sum = a + b + c;
       double ayirmasi = a - b - c;
       double kopaytmasi = a * b * c;
       double bolinmasi = a / b / c;
       double remainder = (a + b) / c;


       System.out.println("yigindisi" +sum);
       System.out.println("ayirmasi" +ayirmasi);
       System.out.println("kopaytmasi" +kopaytmasi);
       System.out.println("bolinmasi" +bolinmasi);
       System.out.println("1-son 2-sonni 3-songa bolganda qoldiqi" +remainder);
       scanner.close();
    };
};

