import org.junit.After;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

public class SmartParkingParkingBoyTest {
    @Test
    public void shouldParkedSuccessIn2ndParkingLotWhenParkACarGivenASmartBoyAndTwoParkingLotsWith1stHasAnEmptyLotAnd2ndHasTwoLots() {
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(2);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot1, parkingLot2));
        ParkingLotReceipt receipt = smartParkingBoy.park(new Car());
        assertEquals(2, receipt.getParkingLotNo());
    }

    @Test
    public void shouldParkedSuccessIn1stParkingLotWhenParkACarGivenASmartBoyAndTwoParkingLotsWith1stHasAnEmptyLotAnd2ndHasAnEmptyLot(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot1, parkingLot2));
        ParkingLotReceipt receipt = smartParkingBoy.park(new Car());
        assertEquals(1, receipt.getParkingLotNo());
    }

    @Test
    public void shouldParkedSuccessIn1stParkingLotAndIn2ndParkingLotWhenParkTwoCarsGivenASmartBoyAndTwoParkingLotsWithBothTwoParkingLotsHave2Lots(){
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot1, parkingLot2));
        ParkingLotReceipt receipt = smartParkingBoy.park(new Car());
        assertEquals(1, receipt.getParkingLotNo());
        ParkingLotReceipt receipt2 = smartParkingBoy.park(new Car());
        assertEquals(2, receipt2.getParkingLotNo());
    }

    @Test(expected = ParkingLotException.class)
    public void shouldParkedFailedWhenParkACarGivenASmartBoyAndTwoParkingLotsWithBothTwoParkingLotsHaveNoLots(){
        ParkingLot parkingLot1 = new ParkingLot(0);
        ParkingLot parkingLot2 = new ParkingLot(0);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot1, parkingLot2));

        smartParkingBoy.park(new Car());
    }

    @Test
    public void shouldPickUpSuccessWhenPickUpTheCarWithReceiptGivenASmartBoyWithAParkingLotReceipt() {
        ParkingLot parkingLot = new ParkingLot(1);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot));

        Car myCar = new Car();
        System.out.println(myCar);
        ParkingLotReceipt receipt = smartParkingBoy.park(myCar);

        Car car = smartParkingBoy.pickUp(receipt);
        System.out.println(car);
        assertEquals(myCar, car);
    }

    @Test(expected = ParkingLotReceiptException.class)
    public void shouldPickUpFailedWhenPickUpACarGivenASmartBoyWithAnInvalidReceipt(){
        ParkingLot parkingLot = new ParkingLot(1);
        SmartParkingParkingBoy smartParkingBoy = new SmartParkingParkingBoy(Arrays.asList(parkingLot));

        smartParkingBoy.pickUp(new ParkingLotReceipt());
    }

    @After
    public void reset() {
        new ParkingLot();
    }
}
