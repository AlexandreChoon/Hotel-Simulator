package Hotel;

public class Person {
    //Properties
    private String name;
    private Key key;
    private Room assignedRoom;

    //Constructor
    public Person(String name){
        this.name = name;

    }
    //Getters
    public Key getKey(){
        return key;
    }
    public String getName(){
        return name;
    }
    public void setKey(Key key) {
        this.key = key;
    }

    public void setAssignedRoom(Room room){
        this.assignedRoom = room;
    }

    //Methods
    public void checkIn(Hotel hotel){
        Room assignedRoom = hotel.giveRoom();
        if (assignedRoom != null) {
            this.assignedRoom = assignedRoom;
            this.key = assignedRoom.getKey();
            assignedRoom.setPerson(this);
            System.out.println("\n" + name + " has checked into hotel " + hotel.getName() + " at room " + assignedRoom.getRoomNumber());
        }

    }

    public void checkInBooking(Hotel hotel){
        if (assignedRoom != null) {
            System.out.println("You don't have a reservation");
            checkIn(hotel);
        }

    }

    public void checkOut(Hotel hotel){
        hotel.takeRoom(this, assignedRoom);

    }

    public void bookRoom(Hotel hotel){
        Room assignedRoom = hotel.giveRoom();
        if (assignedRoom != null) {
            this.assignedRoom = assignedRoom;
            assignedRoom.setPerson(this);
            assignedRoom.setAvail(Availability.BOOKED);
            System.out.println("\n" + name + " has booked a room into hotel " + hotel.getName());
        }
    }

}


