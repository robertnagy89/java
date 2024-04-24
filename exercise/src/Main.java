import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        feladat_1();
    }


    public static void feladat_1() {
        Scanner scanner = null;
        try {
            List<String> words = new ArrayList<>();
            scanner = new Scanner(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\exercise\\src\\random_words.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\exercise\\src\\more_than_10_chars.txt")));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\exercise\\src\\reverse.txt")));
            BufferedWriter writer3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\exercise\\src\\occurences.txt")));



            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
                System.out.println(words);
            }
            Set<String> uniques = new HashSet<>();
            List<String> uniqueList = new ArrayList<>();
            Collections.sort(words);
            Collections.reverse(words);
            for( String word: words){
                if(word.length()>10){
                    writer.write(word + "\n");
                }
                uniques.add(word);
                writer2.write(word+"\n");
            }

            for(String unique: uniques){
                int occurence = 0;
                for(String word: words){
                    if(word.equals(unique)){
                        occurence++;
                    }
                }
                uniqueList.add(unique+ " " + occurence);

            }
            Collections.sort(uniqueList);
            for(String word: uniqueList){
                writer3.write(word + "\n");
            }

            writer.close();
            writer2.close();
            writer3.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IO Exception.");
        }

    }
}