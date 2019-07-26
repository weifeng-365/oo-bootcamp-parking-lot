public class ParkingLot {
    private int volume;
    private int existCarport;
    public ParkingLot(int volume) {
        this.volume = volume;
        this.existCarport = 0;
    }

    public String park(Car car) {
        if (volume > existCarport) {
            existCarport ++;
            car.setHasTicket(true);
            return "Parking Success!";
        } else {
            return "Parking Fail!";
        }
    }

    public String pickUp(Car car) {
        if (car.getHasTicket()) {
            return "Pick Up Success!";
        }
        else {
            return "Pick Up Fail!";
        }
    }
}
