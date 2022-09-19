package priv.lhf.test2;

public class Car {
    private String brand;
    private String type;
    private String vehicleId;
    private int perRent;

    public Car(String brand, String type, String vehicleId, int perRent) {
        this.brand = brand;
        this.type = type;
        this.vehicleId = vehicleId;
        this.perRent = perRent;
    }

    public Car() {
        this.brand = "宝马";
        this.type = "x6";
        this.vehicleId = "京CNY3284";
        this.perRent = 800;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getPerRent() {
        return perRent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", perRent=" + perRent +
                '}';
    }

    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }

    float carRent(int days)
    {
        float total;
        if(days > 7)
            total = perRent * days * 0.9f;
        else
            total = perRent * days;

        return total;
    }
}
