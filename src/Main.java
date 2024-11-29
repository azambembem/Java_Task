//2) ekrandan bitta int soni kiritilsa ko'paytirishdan boshqasini
//ishlatmasdan 1ta amal bilan sonning 2-darajasini toping
//	2 ta amal bilan sonning 4-darajasini toping
//	3 ta amal bilan sonning 6-darajasini toping
//	4 ta amal bilan sonning 12-darajasini toping
//	5 ta amal bilan sonning 16-darajasini toping va ekranga chiqaring


//2
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

  System.out.println("xoxlagan sonni kiriting:");
  int num = scanner.nextInt();

  int ikkinchi_daraja = num * num; // ikkinchi daraja kelib chiqadi.

  int tortinchi_dataja = ikkinchi_daraja * ikkinchi_daraja; // ikkinchi_darajani ikkisira uzini uziga ko'paytirilsa 4-chi darajasi kelib choqadi.

  int oltinchi_daraja = ikkinchi_daraja * ikkinchi_daraja * ikkinchi_daraja;

  int unikkinchi_daraja = oltinchi_daraja * oltinchi_daraja;

  int unoltimchi_dataja = unikkinchi_daraja * ikkinchi_daraja * ikkinchi_daraja;


  System.out.print("2-daraja" +ikkinchi_daraja);
  System.out.println("4-daraja" +tortinchi_dataja);
  System.out.println("6-daraja" +oltinchi_daraja);
  System.out.println("12-daraja" +unikkinchi_daraja);
  System.out.println(("16-daraja" +unoltimchi_dataja));



      System.out.println("1-chi raqamni kiriting: ? ");
      int a = scanner.nextInt();

      String b = (a % 5 == 0 && a % 3 == 0 && a > 0) ? "5 va 3ga karrali musbat" : "aks holda 5 va 3 ga karralik emas";
      System.out.println("natija " +b);

   }
}
//