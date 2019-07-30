import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void shouldReturnParkingSuccessWhenParkACarGivenParkVolumeIs5() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();

        ParkingLotReceipt receipt = parkingLot.park(car);
        assertNotNull(receipt);
    }

    @Test(expected = ParkingLotException.class)
    public void shouldReturnTheSecondCarParkFailedWhenParkTwoCarsGivenParkVolumeIs1 () {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(new Car());

        parkingLot.park(new Car());
    }

    @Test
    public void shouldReturnSuccessWhenPickUpTheCarGivenParkingLotAndValidReceipt () {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        ParkingLotReceipt receipt = parkingLot.park(car);

        Car myCar = parkingLot.pickUp(receipt);
        assertEquals(car, myCar);
    }

    @Test(expected = ParkingLotReceiptException.class)
    public void shouldReturnFailWhenPickUpGivenParkingLotAndNoReceipt () {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(new Car());

        parkingLot.pickUp(null);
    }

    @Test(expected = ParkingLotReceiptException.class)
    public void shouldReturnFailedWhenPickUpCarWithInvalidReceiptGivenParkingLotHasTwoCarsAndReceipts() {
        ParkingLot parkingLot = new ParkingLot(1);
        ParkingLotReceipt receipt = parkingLot.park(new Car());
        parkingLot.pickUp(receipt);

        parkingLot.pickUp(receipt);
    }

    @Test(expected = ParkingLotReceiptException.class)
    public void shouldReturnFailedWhenPickUpCarGivenInvalidReceipt() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(new Car());

        parkingLot.pickUp(new ParkingLotReceipt());
    }
}
