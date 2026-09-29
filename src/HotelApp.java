public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.pickUpVehicle("XYZ-1234");
        frontDesk.cleanRoom(404);
        frontDesk.requestCart(2);
    }
}
