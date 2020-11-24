public class Main {
    public static void main(String[] args) {
  // провожу расчет с точностью рубля,
  // т.к. сказано 1 руб за 100руб, а не 1%
    long amount = 100; //начальная сумма в рублях
    long refill  = 1111; // пополнение счета в рублях
    long bonus;

    if(refill > 1000){bonus = refill / 100; }
    else {bonus  = 0;}
    amount  += refill + bonus;

         // вывод результата в руб.
    System.out.print("бонус- ");
    System.out.print( bonus);
    System.out.println(" руб.");

    System.out.print("итого на счету- ");
    System.out.print(amount);
    System.out.println(" руб.");

     }
}
