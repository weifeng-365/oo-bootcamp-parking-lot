public class App {
    /*public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2);
        ParkingLotReceipt receipt1 = parkAndPrint(parkingLot, new Car(), "Car 1");
        ParkingLotReceipt receipt2 = parkAndPrint(parkingLot, new Car(), "Car 2");
        ParkingLotReceipt receipt3 = parkAndPrint(parkingLot, new Car(), "Car 3");

        pickUpAndPrint(parkingLot, receipt1, "Car 1");
        pickUpAndPrint(parkingLot, new ParkingLotReceipt(), "Car 2");
    }

    public static ParkingLotReceipt parkAndPrint(ParkingLot parkingLot, Car car, String carName) {
        System.out.println("正在停车："+carName+"，请稍后...");

        try {
            ParkingLotReceipt receipt = parkingLot.park(car);
            if(receipt != null) {
                System.out.println(carName + "停车成功！");
                return receipt;
            }
        } catch (ParkingLotException e) {
            System.out.println(carName + "停车失败, 停车场已满!");
        }
        return null;
    }

    public static void pickUpAndPrint(ParkingLot parkingLot, ParkingLotReceipt receipt, String carName) {
        System.out.println("正在取车："+carName+"，请稍后...");
        try {
            Car car = parkingLot.pickUp(receipt);
            if(car != null) {
                System.out.println(carName + "取车成功！");
            }
        } catch (ParkingLotReceiptException e) {
            System.out.println(carName + "取车失败,无效的凭证！");
        }
    }*/
}
