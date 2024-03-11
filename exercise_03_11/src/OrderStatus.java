public enum OrderStatus {
    ORDERED(5),
    READY(2),
    DELIVERED(0);

    public int timeToDeliver;
    OrderStatus(int timeToDeliver){
    }
}
