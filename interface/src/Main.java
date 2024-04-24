import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        feladat_5();
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
    public static void feladat_4(){

        try {
            Scanner scanner = new Scanner(new File("W:\\Webler\\Materials\\Git\\junior_hetfo\\Elso\\real_estate.csv"));

            scanner.nextLine();

            List<RealEstate> realEstates = new ArrayList<>();

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] values = line.split(",");

                double area = Double.parseDouble(values[0]);
                int numberOfRooms= Integer.parseInt(values[1]);

                if(values[2].equals("Flat")){
                    realEstates.add(new Flat(area,numberOfRooms,Integer.parseInt(values[4]),values[3].equals("1")));
                }else{
                    realEstates.add(new House(area,numberOfRooms, values[5].equals("1"), Double.parseDouble(values[6])));
                }


            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void feladat_5(){
        List<CarEmissionInfo> carEmissionInfo = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\RN89\\IdeaProjects\\untitled\\interface\\src\\emission.csv"));
            scanner.nextLine();

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] values = line.split(",");

                String manufacturer = values[0];
                String model = values[1];
                double engineSize = Double.parseDouble(values[3]);
                int co2Emission = Integer.parseInt(values[11]);
                FuelType fuelType = FuelType.parseFuelType(values[6]);
                carEmissionInfo.add(new CarEmissionInfo(manufacturer, model, engineSize, fuelType, co2Emission));
            }
            CarEmissionStatistics stats = new CarEmissionStatistics(carEmissionInfo);
            System.out.println("MinCo2Emission: " + stats.getMinCo2Emission());
            System.out.println("MaxCo2Emission: " + stats.getMaxCo2Emission());
            System.out.println("Unique Engine Size Count: " + stats.getUniqueEngineSizeCount());
            System.out.println("Unique Manufacturers: " + stats.getAllManufacturer());
            System.out.println("CarEmissionInfo by engine size: " +stats.getAllEmissionInfoByEngineSize(1.8));
           // System.out.println("All emission info order by co2 emission desc: " + stats.getAllEmissionInfoOrderByCO2EmissionDesc());
            System.out.println("Get emission info map by Fuel Type: " +stats.getEmissionInfoGroupByFuelType(FuelType.PREMIUM_GASOLINE));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
