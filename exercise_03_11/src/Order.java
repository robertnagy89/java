public class Order {
    private static int publicId = 0;
    private String name;
    private OrderStatus orderStatus;

    public Order(String name, OrderStatus orderStatus, String logisticCompany) {
        this.name = name;
        this.orderStatus = orderStatus;
        this.logisticCompany = logisticCompany;
        publicId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLogisticCompany() {
        return logisticCompany;
    }

    public void setLogisticCompany(String logisticCompany) {
        this.logisticCompany = logisticCompany;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderStatus=" + orderStatus +
                ", logisticCompany='" + logisticCompany + '\'' +
                '}';
    }

    public int getTimeToDelivery(){
        return this.orderStatus.timeToDeliver;
    }

    private String logisticCompany;

}
