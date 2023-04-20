
public class Main {
    public static void main(String[] args) {

        int money = 100;

        int pay = 1500;
        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }

        int sum = money + pay + bonus;
        System.out.println(" Вам начислено " + bonus + " бонусов ");

        System.out.println(" На Вашем счете " + sum + " рублей ");
    }
}