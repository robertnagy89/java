import java.io.*;

public class Words {

    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\fileread\\src\\sample_words.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("word_frequency.txt")));
            String input = reader.readLine();

            String[] words = input.split(" ");

            String[] uniqueWords = new String[words.length];
            int uniqueWordsIndex = 0;

            for(String word : words){
                boolean containsWord = false;
                for(String uniqueWord: uniqueWords){
                    if(uniqueWord == null){
                        break;
                    }
                    if(word.equals(uniqueWord)){
                        containsWord = true;
                        break;
                    }
                }
                if(!containsWord){
                    uniqueWords[uniqueWordsIndex] = word;
                    uniqueWordsIndex++;
                }

            }

            int[] frequencies = new int[words.length];

            for(int i = 0; i < uniqueWords.length; i++){
                if(uniqueWords[i] == null){
                    break;
                }
                for(String word : words){

                    if(word.equals(uniqueWords[i])){
                        frequencies[i]++;
                    }

                }
            }
            for(int i = 0; i< uniqueWords.length; i++){
                if(uniqueWords[i] == null){
                    break;
                }
                writer.write(uniqueWords[i] + " " + frequencies[i] + "\n");
            }
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO exception");
        }



        System.out.println();


    }
}