public class ParkingLotReceipt {
    private int parkingLotNo;
    public ParkingLotReceipt(int parkingLotNo) {
        this.parkingLotNo = parkingLotNo;
    }

    public ParkingLotReceipt() {
        this.parkingLotNo = 0;
    }

    public int getParkingLotNo() {
        return parkingLotNo;
    }
}
