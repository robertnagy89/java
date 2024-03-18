import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Válassz opciót!");
            System.out.println("    1) Meter -> Lab");
            System.out.println("    2) Lab -> Meter");
            System.out.println("    3) Kilometer -> Merfold");
            System.out.println("    4) Merfold -> Kilometer");
            System.out.println("    0) Kilepes");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Adj meg egy mennyiséget!");
                    int amount = scanner.nextInt();
                    System.out.println(Atvalto.meter_lab(amount));
                    break;
                case 2:
                    System.out.println("Adj meg egy mennyiséget!");
                    int amount2 = scanner.nextInt();
                    System.out.println(Atvalto.lab_meter(amount2));
                    break;
                case 3:
                    System.out.println("Adj meg egy mennyiséget!");
                    int amount3 = scanner.nextInt();
                    System.out.println(Atvalto.kilometer_merfold(amount3));
                    break;
                case 4:
                    System.out.println("Adj meg egy mennyiséget!");
                    int amount4 = scanner.nextInt();
                    System.out.println(Atvalto.merfold_kilometer(amount4));
                    break;
                case 0:
                    return;
            }
        }
    }
}