import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        feladat_3();
    }

    public static void feladat_1() {
        Scanner scanner = new Scanner(System.in);
        int next = 1;
        while (next >= 0) {
            System.out.println("Adjon meg 1 szamot");
            next = scanner.nextInt();

        }
    }

    public static void feladat_2() {
        try {
            Set set = new HashSet();
            BufferedReader reader = new BufferedReader(new FileReader(new File("unique.txt")));
            while (reader.readLine() != null) {
                set.add(reader.readLine());
            }
            System.out.println(set.size());

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }

    public static void feladat_3() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\otos.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        scanner.nextLine();

        List<Lotto> lottos = new ArrayList<>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] values = line.split(";");

            long max = Collections.max(List.of(
                    Long.parseLong( values[4].replaceAll(" ","").replaceAll("Ft","")),
                    Long.parseLong( values[6].replaceAll(" ","").replaceAll("Ft","")),
                    Long.parseLong( values[8].replaceAll(" ","").replaceAll("Ft","")),
                    Long.parseLong( values[10].replaceAll(" ","").replaceAll("Ft",""))
            ));

            Lotto lotto = new Lotto(
                    Integer.parseInt(values[0]),
                    Integer.parseInt(values[1]),
                    values[2],
                    max,
                    Set.of(
                            Integer.parseInt(values[11]),
                            Integer.parseInt(values[12]),
                            Integer.parseInt(values[13]),
                            Integer.parseInt(values[14]),
                            Integer.parseInt(values[15])
                    )
            );

            lottos.add(lotto);
        }

        LottoStatistic lottoStatistic = new LottoStatistic(lottos);

        System.out.println("MostFrequentNumber: "+lottoStatistic.mostFrequentNumber());

        System.out.println("LeastFrequentNumber: "+ lottoStatistic.leastFrequentNumber());
        lottoStatistic.highestPayout();
    }
}
