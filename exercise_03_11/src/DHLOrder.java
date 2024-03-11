public class DHLOrder extends Order{

    public DHLOrder(String name, OrderStatus orderStatus) {
        super(name, orderStatus, "DHLOrder");
    }

    @Override
    public int getTimeToDelivery() {
        int baseDeliveryTime = super.getTimeToDelivery();
        if(baseDeliveryTime !=0){
            return baseDeliveryTime += 2;
        }
        return baseDeliveryTime;
    }
}
