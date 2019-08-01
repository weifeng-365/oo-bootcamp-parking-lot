import java.util.HashMap;

public class ParkingLot {
    private static int parkingLotGlobalNo = 0;
    private int parkingLotNo;
    private int volume;
    private int existCarport;
    private HashMap<ParkingLotReceipt, Car> parkingLot = new HashMap<>();

    public ParkingLot(int volume) {
        this.volume = volume;
        this.existCarport = 0;
        parkingLotGlobalNo++;
        this.parkingLotNo = parkingLotGlobalNo;
    }

    public ParkingLot() {
        parkingLotGlobalNo = 0;
        this.parkingLotNo = parkingLotGlobalNo;
    }

    public ParkingLotReceipt park(Car car) {
        if (volume > existCarport) {
            existCarport++;
            ParkingLotReceipt receipt = new ParkingLotReceipt(parkingLotNo);
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

    public int getParkingLotNo() {
        return parkingLotNo;
    }
}
