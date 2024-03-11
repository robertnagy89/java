

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        Roulette roulette = new Roulette(getBalanceFromUser(scanner));


        switch (getBetType(scanner)) {
            case COLOR:
                System.out.println(BetType.COLOR);

                System.out.println("Kérem válasszon a színek közül!");
                System.out.println("\t 1. Piros");
                System.out.println("\t 2. Fekete");
                System.out.println("\t 3. Vissza lépés!");

                int option = scanner.nextInt();
                if (option == 3) {
                    break;
                }

                Color color = option == 1 ? Color.RED : Color.BLACK;
                /*
                if (option == 1) {
                    color = Color.RED;
                } else {
                    color = Color.BLACK;
                }
                */

                if (roulette.betOnColor(getAmountFromUser(scanner), color)) {
                    System.out.println("Gratulálok nyertél!");
                } else {
                    System.out.println("Sajnos vesztettél!");
                }
                break;
            case NUMBER:
                System.out.println(BetType.NUMBER);
                break;
            case PARITY:
                System.out.println(BetType.PARITY);
                break;
            case HALF:
                System.out.println(BetType.HALF);
                break;
            case THIRD:
                System.out.println(BetType.THIRD);
                break;
        }
    }

    public static int getBalanceFromUser(Scanner scanner) {
        System.out.println("Kérem adja meg, az egyenlegét (1000 - 10 000)!");
        int balance = scanner.nextInt();
        while (balance > 10000 || balance < 1000) {
            System.err.println("Az egyenlegnek 1000 és 10 000 között kell lennie!");
            balance = scanner.nextInt();
        }
        return balance;
    }

    public static BetType getBetType(Scanner scanner) {

        while (true) {
            System.out.println("Kérem válasszon a lehetőségek közül!");
            System.out.println("\t 1. Fogadás színre");
            System.out.println("\t 2. Fogadás számra");
            System.out.println("\t 3. Fogadás páros vagy páratlan");
            System.out.println("\t 4. Fogadás 1-18 / 19-36");
            System.out.println("\t 5. Fogadás 1-12 / 13-24 / 25 - 36");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    return BetType.COLOR;
                case 2:
                    return BetType.NUMBER;
                case 3:
                    return BetType.PARITY;
                case 4:
                    return BetType.HALF;
                case 5:
                    return BetType.THIRD;
                default:
                    System.err.println("Kérem válasszon a lehetséges opciók közül");
                    break;
            }
        }
    }

    public static int getAmountFromUser(Scanner scanner) {
        System.out.println("Kérem adja meg a feltett összeget!");
        return scanner.nextInt();
    }
}
