import java.util.List;

public class SuperParkingBoy extends Boy{
    public SuperParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    public ParkingLotReceipt park(Car car) {
        ParkingLot parkingLot = parkingLots.get(0);
        for(int i = 1; i < super.parkingLots.size(); i++){
            if(parkingLots.get(i).getLotEmptyRate() > parkingLot.getLotEmptyRate()){
                parkingLot = parkingLots.get(i);
            }
        }
        return parkingLot.park(car);
    }
}
