public enum FuelType {

    REGULAR_GASOLINE, //X
    PREMIUM_GASOLINE, //Z
    DIESEL, // D
    E85, //E
    NATURAL_GAS, // N
    UNKNOWN;

    public static FuelType parseFuelType(String fuelType){
        if(fuelType.equals("X")){
            return FuelType.REGULAR_GASOLINE;
        }
        if(fuelType.equals("Z")){
            return FuelType.PREMIUM_GASOLINE;
        }
        if(fuelType.equals("D")){
            return FuelType.DIESEL;
        }
        if(fuelType.equals("E")){
            return FuelType.E85;
        }
        if(fuelType.equals("N")){
            return FuelType.NATURAL_GAS;
        }

            return FuelType.UNKNOWN;

    }
}
