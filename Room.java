package Hotel;

public class Room {
    //Properties
    private String roomNumber;
    private int capacity;
    private Person person;
    private Availability avail = Availability.EMPTY;
    private Key key;

    //Constructor
    public Room(int capacity, String number){
        this.roomNumber = number;
        this.capacity = capacity;
        this.key = new Key("fgufrdytrdht");

    }

    //Getters
    public Key getKey() {
        return key;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public Availability getAvail(){
        return avail;
    }

    //Setters
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setAvail(Availability avail){
        this.avail = avail;
    }

    public void setPerson(Person person){
        this.person = person;
    }
}


