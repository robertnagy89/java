import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoStatistic {

    private final List<Lotto> lottoList;

    public LottoStatistic(List<Lotto> lottoList) {
        this.lottoList = lottoList;
    }

    public int mostFrequentNumber() {

        List<Integer> numbers = new ArrayList<>();

        for (Lotto lotto : lottoList) {
            numbers.addAll(lotto.getNumbers());
        }

        int maxFreq = Integer.MIN_VALUE;
        int mostFreqNumber = 0;

        for (int i = 1; i < 91; i++) {

            int frequency = Collections.frequency(numbers, i);

            if(frequency > maxFreq){
                maxFreq = frequency;
                mostFreqNumber = i;
            }
        }

        return mostFreqNumber;
    }

    public int leastFrequentNumber() {
        List<Integer> numbers = new ArrayList<>();
        for(Lotto lotto : lottoList){
            numbers.addAll(lotto.getNumbers());
        }

        int minFreq = Integer.MAX_VALUE;
        int minNumber = 0;
        for(int i =1; i<91;i++){
            int frequency = Collections.frequency(numbers, i);
            if(frequency < minFreq){
                minFreq = frequency;
                minNumber = i;
            }
        }
        return minNumber;
    }

    public void highestPayout(){
        long highestPayout= 0;
        String date = " ";
        for(Lotto lotto: lottoList){
            long payout = lotto.getHighestPrize();
            if(payout > highestPayout){
                highestPayout = payout;
                date = lotto.getDateOf();
            }
        }
        System.out.println("Highestpayout: " +highestPayout + " " +date);
    }
} 