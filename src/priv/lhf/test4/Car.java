package priv.lhf.test4;

public class Car extends MotoVehicle{

    String type;

    public Car(String vehicleId, String brand, int perRent, String type) {
        super(vehicleId, brand, perRent);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public float calRent(int days) {
        if(days > 7)
            return (float) (super.perRent * days * 0.8);
        else
            return super.perRent * days;
    }

    @Override
    public void leaseOutFlow() {
        System.out.println("car租车流程");
    }
}
