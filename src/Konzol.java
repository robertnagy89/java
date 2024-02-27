import java.util.Random;
import java.util.Scanner;

public class Konzol {
    public static void main(String[] args) {

        Ember ember = new Ember("Peti");
        System.out.println(Ember.emberekSzama);
        Ember ember2 = new Ember("Peti");
        System.out.println(Ember.emberekSzama);
        Ember ember3 = new Ember("Peti");
        System.out.println(Ember.emberekSzama);
        Ember ember4 = new Ember("Peti");
        System.out.println(Ember.emberekSzama);
        Ember ember5 = new Ember("Peti");
        System.out.println(Ember.emberekSzama);


        Termek[] termekek = new Termek[]{
                new Laptop("ASUS", 330000, 15),
                new Laptop("ASUS Pro", 380000, 15),
                new Kamera("Canon", 30000, 70),
                new Kamera("Nikon", 130000, 120),
                new Kamera("Canon Pro", 110000, 90)
        };
        for (int i = 0; i < termekek.length; i++) {
            System.out.println(termekek[i]);
        }

    }

    public static void feladat_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány számot átlagolunk?");
        double toAvg = scanner.nextDouble();
        double sum = 0;
        for (int i = 0; i < toAvg; i++) {
            System.out.println("Következő szám:");
            sum += scanner.nextDouble();
        }
        System.out.println(sum / toAvg);
    }

    public static void feladat_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy műveleti jelet");
        String operative = scanner.nextLine();
        System.out.println("Adjon meg egy számot");
        double n1 = scanner.nextDouble();
        System.out.println("Adjon meg még egy számot");
        double n2 = scanner.nextDouble();
        switch (operative) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("0-val nem osztunk.");
                }
                break;
        }
    }

    public static void feladat_5() {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippeljen 1 számot 1 és 100között!");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num > randomNumber) {
                System.out.println("A szám kisebb mint " + num);
            }
            if (num < randomNumber) {
                System.out.println("A szám nagyobb mint " + num);
            }
            if (num == randomNumber) {
                System.out.println("Kitaláltad, a szám " + num + " volt");
                break;
            }
        }
    }
}
