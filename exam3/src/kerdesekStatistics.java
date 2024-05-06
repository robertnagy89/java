import java.util.*;

public class kerdesekStatistics {
    private final List<kerdesek> kerdesek;

    public kerdesekStatistics(List<kerdesek> kerdesek) {
        this.kerdesek = kerdesek;
    }

    public List<String> getQuestionsByTheme(String theme) {
        List<String> kerdesList = new ArrayList<>();
        for (kerdesek kerdes : kerdesek) {
            if (kerdes.getTema().equals(theme)) {
                kerdesList.add(kerdes.getKerdes());
            }
        }
        return kerdesList;
    }

    public List<kerdesek> getRandomQuestions(int amount) {
        Set<Integer> ints = new HashSet<>();
        Random random = new Random();
        while (ints.size() != amount) {
            ints.add(random.nextInt(0, kerdesek.size()));
        }
        List<kerdesek> kerdesekList = new ArrayList<>();
        for (int integer : ints) {
            kerdesekList.add(kerdesek.get(integer));
        }
        return kerdesekList;
    }

    public Map<String, List<kerdesek>> getQuestionsGroupedByTheme() {
        Map<String, List<kerdesek>> questionsGroupedByTheme = new HashMap<>();
        for (kerdesek kerdes : kerdesek) {
            if (!questionsGroupedByTheme.containsKey(kerdes.getTema())) {
                questionsGroupedByTheme.put(kerdes.getTema(), new ArrayList<>());
            }
            questionsGroupedByTheme.get(kerdes.getTema()).add(kerdes);
        }

        return questionsGroupedByTheme;
    }

    public void themeWithMostPoints() {
        Map<String, List<kerdesek>> kerdesekMap = getQuestionsGroupedByTheme();
        Map<String, Integer> points = new HashMap<>();
        for (String kerdes : kerdesekMap.keySet()) {
            for (kerdesek kerdes1 : kerdesekMap.get(kerdes)) {
                if (!points.containsKey(kerdes)) {
                    points.put(kerdes, 0);
                }
                points.put(kerdes, points.get(kerdes) + kerdes1.getHanyadikValasz());
            }
        }
        String theme = "";
        int point = Integer.MIN_VALUE;
        for(String thema: points.keySet()){
            if(point<points.get(thema)){
                theme = thema;
                point = points.get(thema);
            }
        }
        System.out.println("Highest points in theme: " + theme + " with value of: " + point);
    }
}
