import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void shouldReturnParkingSuccessWhenParkACarGivenParkVolumeIs5() {
        ParkingLot parkingLot = new ParkingLot(5);
        Car car = new Car();
        assertEquals("Parking Success!", parkingLot.park(car));
    }

    @Test
    public void shouldReturnParkingFailWhenParkACarGivenParkVolumeIs1AndRemainIs0 () {
        ParkingLot park = new ParkingLot(1);
        Car car = new Car();
        park.park(car);
        assertEquals("Parking Fail!", park.park(car));
    }

    @Test
    public void shouldReturnPickupCarSuccessWhenPickupGivenParkVolumeIs1AndAParkingLotAndCarHaveATicket () {
        ParkingLot park = new ParkingLot(1);
        Car car = new Car();
        park.park(car);
        assertEquals("Pick Up Success!", park.pickUp(car));
    }

    @Test
    public void shouldReturnPickupCarFailWhenPickupGivenParkVolumeIs1AndAParkingLotAndCarHaveNoTicket () {
        ParkingLot park = new ParkingLot(1);
        Car car = new Car();
        assertEquals("Pick Up Fail!", park.pickUp(car));
    }
}
