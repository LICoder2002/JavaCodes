package priv.lhf.test4;

public class Bus extends MotoVehicle{

    int seatCount;

    public Bus(String vehicleId, String brand, int perRent, int seatCount) {
        super(vehicleId, brand, perRent);
        this.seatCount = seatCount;
    }


    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }


    @Override
    public float calRent(int days) {
        if(days> 9)
            return (float) (super.perRent * days * 0.8);
        else
            return super.perRent * days;
    }

    @Override
    public void leaseOutFlow() {
        System.out.println("bus租车流程");
    }
}
