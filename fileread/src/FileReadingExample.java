import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileReadingExample {
    public static void main(String[] args) {
        Termek[] termekek = new Termek[]{new Termek("Macbook", 5000), new Termek("Samsung TV", 2000), new Termek("Macbook pro", 7000), new Termek("Samsung Galaxy A32", 4000)};
        writeTermekToCSV(termekek);
    }

    public static void feladat_1() {
        try {
            File filePath = new File("a.txt");
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            File filePathB = new File("b.txt");
            FileWriter fileWriterB = new FileWriter(filePathB, true);
            BufferedWriter bufferedWriterB = new BufferedWriter(fileWriterB);

            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    bufferedWriterB.write(i + "\n");
                } else {
                    bufferedWriter.write(i + "\n");
                }
            }

            bufferedWriterB.close();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void feladat_2() {
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("words.txt")));


            String word;
            int counter = 1;
            while (true) {
                word = scanner.nextLine();
                if (Objects.equals(word, "exit")) {
                    break;
                }
                bufferedWriter.write(counter + " " + word + "\n");
                counter++;
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTermekToCSV(Termek[] termekek) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("termekek.csv")));

            int counter = 0;
            while (true) {
                bufferedWriter.write(termekek[counter].getAzonosito() + " " + termekek[counter].getMegnevezes() + " " + termekek[counter].getAr() + "\n");
                counter++;
                if (counter == termekek.length) {
                    break;
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
