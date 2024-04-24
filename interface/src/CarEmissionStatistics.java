import java.util.*;

public class CarEmissionStatistics {

    private final List<CarEmissionInfo> cars;

    public CarEmissionStatistics(List<CarEmissionInfo> cars) {
        this.cars = cars;
    }


    public int getMinCo2Emission() {
        int min = Integer.MAX_VALUE;
        for(CarEmissionInfo car: cars){
            if(car.getCo2Emission() < min){
                min = car.getCo2Emission();
            }
        }
        return min;
    }

    public int getMaxCo2Emission() {
        int max = Integer.MIN_VALUE;
        for(CarEmissionInfo car: cars){
            if(car.getCo2Emission() > max){
                max = car.getCo2Emission();
            }
        }
        return max;
    }

    public int getUniqueEngineSizeCount(){
        Set<Double> uniques = new HashSet<Double>();
        for(CarEmissionInfo car: cars){
            uniques.add(car.getEngineSize());
        }
        return uniques.size();
    }

    public List<String> getAllManufacturer(){
        Set<String> uniqueManufacturers = new HashSet<String>();
        for(CarEmissionInfo car:cars){
            uniqueManufacturers.add(car.getManufacturer());
        }
        List<String> manufacturers = new ArrayList<>();
        for(String unique:uniqueManufacturers){
            manufacturers.add(unique);
        }
        return manufacturers;
    }

    public List<CarEmissionInfo> getAllEmissionInfoByEngineSize(double engineSize){
        List<CarEmissionInfo> reqEngine = new ArrayList<>();
        for(CarEmissionInfo car: cars){
            if(car.getEngineSize() == engineSize){
                reqEngine.add(car);
            }
        }
        return reqEngine;
    }

    public List<CarEmissionInfo> getAllEmissionInfoOrderByCO2EmissionDesc(){
        Collections.sort(cars);
        Collections.reverse(cars);
        return cars;
    }

    public Map<FuelType, CarEmissionInfo> getEmissionInfoGroupByFuelType(FuelType fuelType){
        Map<FuelType,CarEmissionInfo> emissionInfoMap = new HashMap<>();
        for(CarEmissionInfo car: cars){
            if(fuelType == car.getFuelType()){
                emissionInfoMap.put(car.getFuelType(), car);
            }
        }
        return emissionInfoMap;
    }


}
