import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class FileReadingExample {
    public static void main(String[] args) {
        // recFiles(new File("C:\\Users\\RN89\\IdeaProjects\\untitled"));
        Subject[] subjects = new Subject[]{
                new Subject("matek",50),
                new Subject("tesi",90),
                new Subject("technika",80)
        };
        Student student = new Student(1,"Peti", subjects);

        readGrades();
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

    public static void recFiles(File file){

        for(File f: file.listFiles()){
            if(f.isDirectory()){
                System.out.println(f);
                recFiles(f);
            }
        }
    }
    public static void readGrades()  {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\fileread\\src\\grades.txt")));
            reader.readLine();
            for(int i=0; i<5;i++){
                String line = reader.readLine();
                String[] values = line.split(",");
                Subject[] subjects = new Subject[]{
                        new Subject("math", Integer.parseInt(values[2].trim())),
                        new Subject("history", Integer.parseInt(values[3].trim())),
                        new Subject("english",Integer.parseInt(values[4].trim()))
                };
                Student student = new Student(Integer.parseInt(values[0].trim()),values[1], subjects);
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");;
        }

    }
}
