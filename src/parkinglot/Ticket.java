

package parkinglot;

public class Ticket {
    private String ticketId;
    private long entrytime;
    private vehicle vehicle;
    private int spotId;


    public Ticket(String ticketId, vehicle vehicle, int spotId) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spotId = spotId;
        this.entrytime = System.currentTimeMillis(); // Automatically set entry timestamp
    }

    public String getTicketId() { return ticketId; }
    public long getEntrytime() { return entrytime; }
    public vehicle getVehicle() { return vehicle; }
    public int getSpotId() { return spotId; }
}