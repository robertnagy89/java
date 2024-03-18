import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        TermeszetesSzam[] j = new TermeszetesSzam[5];
        while (i < 5)
            try {
                System.out.println("Adjon meg 1 természetes számot.");
                TermeszetesSzam termeszetesSzam = new TermeszetesSzam(scanner.nextInt());
                j[i] = termeszetesSzam;
                i++;
            } catch (NemPozitivSzamException e) {
                System.err.println("nem pozitiv szám!");
            }
        for(TermeszetesSzam tsz: j){
            System.out.println(tsz);
        }


        Termek termek = new Termek("szena", 2);
        try {
            termek.levonKeszletbol(3);
        } catch (NincsKeszletenException e) {
            System.out.println(termek.getNev() + " nincs keszleten!");
        }

        try {
            feladat_1(scanner);
        } catch (NemMegfeleloEletkorException e) {
            System.err.println("Nem Megfelelő életkor!");
        }
    }

    public static void feladat_1(Scanner scanner) throws NemMegfeleloEletkorException {
        System.out.println("Adjon meg életkort 0 és 120között.");
        int age = scanner.nextInt();
        if (age > 0 && age < 120) {
            System.out.println(age);
        } else {
            throw new NemMegfeleloEletkorException();
        }
    }
}
