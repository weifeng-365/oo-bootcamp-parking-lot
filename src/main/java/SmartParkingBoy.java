import java.util.List;

public class SmartParkingBoy extends Boy{

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    public ParkingLotReceipt park(Car car) {
        ParkingLot parkingLot = parkingLots.get(0);
        for(int i = 1; i < parkingLots.size(); i++){
            if(parkingLots.get(i).getEmptyLots() > parkingLot.getEmptyLots()){
                parkingLot = parkingLots.get(i);
            }
        }
        return parkingLot.park(car);
    }
}
