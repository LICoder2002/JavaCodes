package priv.lhf.test4;

public abstract class MotoVehicle {
     String vehicleId;
     String brand;
     int perRent;


    public MotoVehicle(String vehicleId, String brand, int perRent) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.perRent = perRent;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerRent() {
        return perRent;
    }

    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }

    public abstract float calRent(int days);

    public abstract void leaseOutFlow();

}
