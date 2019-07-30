import java.util.HashMap;

public class ParkingLot {
    private int volume;
    private int existCarport;
    private HashMap<ParkingLotReceipt, Car> parkingLot = new HashMap<>();

    public ParkingLot(int volume) {
        this.volume = volume;
        this.existCarport = 0;
    }

    public ParkingLotReceipt park(Car car) {
        if (volume > existCarport) {
            existCarport++;
            ParkingLotReceipt receipt = new ParkingLotReceipt();
            parkingLot.put(receipt, car);
            return receipt;
        }
        throw new ParkingLotException("ParkingLot is full!");
    }

    public Car pickUp(ParkingLotReceipt receipt) {
        if(parkingLot.containsKey(receipt)) {
            return parkingLot.remove(receipt);
        }

        throw new ParkingLotReceiptException("Invalid receipt!");
    }
}
