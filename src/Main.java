import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~12gacha bulgan sonni kiriting:");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("YAN");
                break;
            case 2 :
                System.out.println("FEB");
                break;
            case 3 :
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("IYUN");
                break;
            case 7:
                System.out.println("IYUL");
                break;
            case 8:
                System.out.println("AVG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default: System.out.println("XATO");
        };
        scanner.close();
        }
    };