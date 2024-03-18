//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Szemely[] szemely = new Szemely[] {
                    new Diak("Fehér Juliska", 1001, 2),
                    new Diak("Fekete Petike", 1002, 2),
                    new Diak("Szürke Mariska", 1003, 3),
                    new Diak("Barna Barnabás", 1004, 4),
                    new Tanar("Piros Virág", 1005, "matematika"),
                    new Tanar("Fehér Juliska", 1006, "irodalom")
        };
            for(Szemely sz: szemely){
                System.out.println(sz);
        }
    }
}