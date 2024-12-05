import java.util.Scanner;
public class CoffePrice   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("어떤 커피 드릴까요?");
        String order = scanner.next();
        int price = 0;

        switch (order) {
            case "expresso" :
            case "capucino" :
            case "latte" :
                price = 3500;
                break;
            case "americano":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다");
        }
        if (price != 0) {
            System.out.println(order + "는" + price + "원입니다.");
        }
        scanner.close();
    }
}
