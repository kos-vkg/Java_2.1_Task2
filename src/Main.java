public class Main {
    public static void main(String[] args) {
        long amount = 100; //начальная сумма в рублях
        long refill = 1111; // пополнение счета в рублях
        long bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        amount += refill + bonus;
        System.out.println("бонус- " + bonus + " руб.");
        System.out.println("итого на счету- " + amount + " руб.");
    }
}
