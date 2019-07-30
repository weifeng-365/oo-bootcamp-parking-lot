import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GraduateParkingBoyTest {
    @Test
    public void shouldReturnParkingSuccessWhenParkACarGivenABoyAndTwoParkinglotsWithVolumeIs1(){
        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);
        ArrayList parkingLots = new ArrayList();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);
        GraduateParkingBoy boy = new GraduateParkingBoy(Arrays.asList(parkingLot1,parkingLot2));
        ParkingLotReceipt receipt = boy.park(new Car());
        assertNotNull(receipt);
    }
}
