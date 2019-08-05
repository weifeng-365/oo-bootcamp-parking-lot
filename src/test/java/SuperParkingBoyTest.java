import org.junit.After;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

public class SuperParkingBoyTest {
    @Test
    public void shouldParkedSuccessIn2ndParkingLotWhenParkACarGivenASuperBoyAndTwoParkingLotsWith1stHasTwoLotsAndOneEmptyLotAnd2ndHasTwoLotsAndTwoEmptyLots() {
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(Arrays.asList(parkingLot1, parkingLot2));
        superParkingBoy.park(new Car());

        ParkingLotReceipt receipt = superParkingBoy.park(new Car());
        assertEquals(2, receipt.getParkingLotNo());
    }

    @Test
    public void shouldParkedSuccessIn1stParkingLotWhenParkACarGivenASuperBoyAndTwoParkingLotsWith1stHasOneLotAndOneEmptyLotAnd2ndHasTwoLotsAndOneEmptyLot(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(2);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(Arrays.asList(parkingLot1, parkingLot2));

        ParkingLotReceipt receipt1 = superParkingBoy.park(new Car());
        superParkingBoy.park(new Car());
        superParkingBoy.pickUp(receipt1);

        ParkingLotReceipt receipt = superParkingBoy.park(new Car());
        assertEquals(1, receipt.getParkingLotNo());
    }

    @Test(expected = ParkingLotException.class)
    public void shouldParkedFailedWhenParkACarGivenASuperBoyAndTwoParkingLotsWithBothTwoParkingLotsHaveNoLots(){
        ParkingLot parkingLot1 = new ParkingLot(0);
        ParkingLot parkingLot2 = new ParkingLot(0);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(Arrays.asList(parkingLot1, parkingLot2));

        superParkingBoy.park(new Car());
    }

    @Test
    public void shouldPickUpSuccessWhenPickUpTheCarWithReceiptGivenASuperBoyWithAParkingLotReceipt() {
        ParkingLot parkingLot = new ParkingLot(1);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(Arrays.asList(parkingLot));

        Car myCar = new Car();
        System.out.println(myCar);
        ParkingLotReceipt receipt = superParkingBoy.park(myCar);

        Car car = superParkingBoy.pickUp(receipt);
        System.out.println(car);
        assertEquals(myCar, car);
    }

    @Test(expected = ParkingLotReceiptException.class)
    public void shouldPickUpFailedWhenPickUpACarGivenASuperBoyWithAnInvalidReceipt(){
        ParkingLot parkingLot = new ParkingLot(1);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(Arrays.asList(parkingLot));

        superParkingBoy.pickUp(new ParkingLotReceipt());
    }

    @After
    public void reset() {
        new ParkingLot();
    }
}
