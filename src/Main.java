public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int replenishment = 1100;
        int bonus = 1000;
        int gift = replenishment/100;
        if (replenishment > bonus) {
            System.out.println("Баланс: " + (balans+gift+replenishment));
        } else {
            System.out.println("Баланс: " + (balans+replenishment));
        }
    }
}