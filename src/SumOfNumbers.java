//2) 1 dan 100 gacha bo‘lgan sonlar ichidan 3 ga bo’linadigan ammo 5 ga bo‘linmaydigan sonlarning yig’indisini
//hisoblovchi dastur tuzing.

public class SumOfNumbers  {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for (i =1; i <100; i++ ) {
            if (i % 3 == 0 && i % 5 !=0) {
                sum = sum +i;
            }
        }
        System.out.println("3ga bulinadigan va 5ga bulinmaydigan sonlar yigindisini toping!" +sum);
    }
}
