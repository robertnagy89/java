public class GLSOrder extends Order{
    public GLSOrder(String name, OrderStatus orderStatus, String carrierPhoneNumber) {
        super(name, orderStatus, "GLS");
        this.carrierPhoneNumber = carrierPhoneNumber;
    }

    private String carrierPhoneNumber;

    public String getCarrierPhoneNumber() {
        return carrierPhoneNumber;
    }

    public void setCarrierPhoneNumber(String carrierPhoneNumber) {
        this.carrierPhoneNumber = carrierPhoneNumber;
    }

    @Override
    public String toString() {
        return "GLSOrder{" +
                "carrierPhoneNumber='" + carrierPhoneNumber + '\'' +
                '}';
    }
}
