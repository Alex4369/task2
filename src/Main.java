public class Main {
    public static void main(String[] args) {
        int check = 500;
        int replenishmentCheck = 1100;
        int bonus;
        int phoneBill;
        if (replenishmentCheck >= 1000) {
            bonus = replenishmentCheck / 100;
             phoneBill = check + replenishmentCheck + bonus;
        } else phoneBill = check + replenishmentCheck;
        System.out.println("Текущий баланс");
        System.out.println(phoneBill);


    }
}
