import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GraduateParkingBoyTest {
    @Test
    public void shouldReturnParkingSuccessWhenParkACarGivenABoyAndTwoParkingLotsWithVolumeIs1(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));
        ParkingLotReceipt receipt = boy.park(new Car());
        assertNotNull(receipt);
    }
    @Test
    public void shouldReturnParkingSuccessWhenParkingTwoCarsGivenABoyAndTwoParkingLotsWithVolumeIs1(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        boy.park(new Car());
        ParkingLotReceipt receipt2 = boy.park(new Car());

        assertNotNull(receipt2);
    }

    @Test
    public void shouldReturnParkingSuccessWhenParkingTwoCarsGivenABoyAndTwoParkingLotsWithVolumeIs2(){
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        ParkingLotReceipt receipt1 = boy.park(new Car());
        ParkingLotReceipt receipt2 = boy.park(new Car());

        assertEquals(1,receipt1.getParkingLotNo());
        assertEquals(1,receipt2.getParkingLotNo());
    }

    @Test(expected = ParkingLotException.class)
    public void shouldReturnParkingFailedWhenParkingThreeCarsGivenABoyAndTwoParkingLotsWithVolumeIs1(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        boy.park(new Car());
        boy.park(new Car());
        boy.park(new Car());
    }

    @Test
    public void shouldReturnSuccessWhenPickUpTheCarGivenABoyAndTwoParkingLotsWithAParkingLotReceipt(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        Car myCar = new Car();
        ParkingLotReceipt receipt = boy.park(myCar);

        Car car = boy.pickUp(receipt);
        assertEquals(myCar, car);
    }
    @Test(expected = ParkingLotReceiptException.class)
    public void shouldReturnFailedWhenPickUpTheCarGivenABoyAndTwoParkingLotsWithAInvalidParkingLotReceipt(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        boy.pickUp(new ParkingLotReceipt());
    }

    @Test
    public void shouldReturnSuccessWhenParkThreeCarsPickUpOneCarParkOneCarGivenTwoParkingLotWithVolumeIs2() {
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));

        ParkingLotReceipt receipt = boy.park(new Car());
        boy.park(new Car());
        boy.park(new Car());
        boy.pickUp(receipt);

        ParkingLotReceipt newReceipt = boy.park(new Car());
        assertEquals(1, newReceipt.getParkingLotNo());
    }

    @After
    public void reset() {
        new ParkingLot();
    }
}
