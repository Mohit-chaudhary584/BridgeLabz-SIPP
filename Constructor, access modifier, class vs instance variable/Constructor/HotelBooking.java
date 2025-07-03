public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("Mohit Sharma", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(paramBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();
        System.out.println("\nParameterized Booking:");
        paramBooking.displayBooking();
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }
}