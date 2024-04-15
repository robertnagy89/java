import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        feladat_2();
    }

    public static void feladat_1() {
        Scanner scanner = new Scanner(System.in);
        int next = 1;
        while (next >= 0) {
            System.out.println("Adjon meg 1 szamot");
            next = scanner.nextInt();

        }
    }

    public static void feladat_2(){
        try{
            Set set = new HashSet();
            BufferedReader reader = new BufferedReader(new FileReader(new File("unique.txt")));
            while(reader.readLine() != null){
                set.add(reader.readLine());
            }
            System.out.println(set.size());

        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("IO exception");
        }
    }
}