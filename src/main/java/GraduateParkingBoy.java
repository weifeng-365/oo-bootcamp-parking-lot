import java.util.List;

public class GraduateParkingBoy {
    private List<ParkingLot> parkingLots;
    public GraduateParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLotReceipt park(Car car) {
        for (int i = 0; i < parkingLots.size(); i++) {
            ParkingLot parkingLot = parkingLots.get(i);
            try {
                return parkingLot.park(car);
            } catch (ParkingLotException e) {
                continue;
            }
        }

        throw new ParkingLotException("ParkingLot is full!");
    };

    public Car pickUp(ParkingLotReceipt receipt) {
        for (int i = 0; i < parkingLots.size(); i++) {
            ParkingLot parkingLot = parkingLots.get(i);
            try {
                return parkingLot.pickUp(receipt);
            } catch (ParkingLotReceiptException e) {
                continue;
            }
        }

        throw new ParkingLotReceiptException("Invalid receipt!");
    };
}
