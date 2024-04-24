import java.util.*;

public class EmissionStatistics {

    private final List<EmissionRekord> emissions;

    public EmissionStatistics(List<EmissionRekord> emissions) {
        this.emissions = emissions;
    }

    public void mostEmitterSectorByStateAndYear(String state, int year) {
        List<EmissionRekord> emissionList = new ArrayList<>();
        for (EmissionRekord emission : emissions) {
            if (emission.getState().equals(state) && emission.getYear() == year) {
                emissionList.add(emission);
            }
        }
        Collections.sort(emissionList);
        Collections.reverse(emissionList);
        System.out.println(emissionList.get(0));
    }

    public void mostEmitterStateByYear(int year) {
        List<EmissionRekord> emissionRekords = new ArrayList<>();
        for (EmissionRekord emission : emissions) {
            if (emission.getYear() == year) {
                emissionRekords.add(emission);
            }
        }
        Map<String, Double> emissionsMap = new HashMap<String, Double>();
        for(EmissionRekord emission: emissionRekords){
            if(!emissionsMap.containsKey(emission.getState())){
                emissionsMap.put(emission.getState(), 0.0);
            }
            String currentState = emission.getState();
            double value = emissionsMap.get(currentState) + emission.getEmissionAmount();
            emissionsMap.put(currentState, value);
        }


        for(double emission:emissionsMap.values()){

        }


    }


    public void mostEmitterState() {
        HashMap<String, Double> mostEmissions = new HashMap<>();
        for(EmissionRekord emission: emissions){
            if(!mostEmissions.containsKey(emission.getState())){
                mostEmissions.put(emission.getState(), 0.0);
            }
            String currentState= emission.getState();
            double emissionValue = mostEmissions.get(currentState) + emission.getEmissionAmount();
            mostEmissions.put(currentState, emissionValue);
        }
        System.out.println(mostEmissions);
    }
}
