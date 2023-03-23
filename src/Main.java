public class Main {
    public static void main(String[] args) {

        int wallet = 250; // остаток на счете
        int amount = 200; // сумма пополнения
        int bonus; // бонус за пополнение свыше 1000 р.
        int total; // итоговая сумма счета

        if (amount>1000)
        {
            bonus = (wallet + amount) / 100;
        } else {
            bonus = 0;
        }
        total = wallet + amount + bonus;


        System.out.println("Сумма итогового счета:" + total);
    }
}