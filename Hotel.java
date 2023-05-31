package Hotel;

import java.sql.Struct;

public class Hotel {
    //Properties
    private String name;
    private int numOfRooms;
    private Room[] rooms;
    private int vacantRooms;

    //Constructors
    public Hotel(String name, int numOfRooms){

        this.name = name;
        this.numOfRooms = numOfRooms;
        this.rooms = new Room[numOfRooms];
        for(int i = 0; i < numOfRooms; i++){
            int roomNum = 100 + (i + 1);
            String stringNum = Integer.toString(roomNum);
            Room room = new Room(1, stringNum);
            rooms[i] = room;
        }

    }

    //Getters
    public int getNumOfRooms() {
        return numOfRooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public String getName(){
       return name;
    }
    //Setters
    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    //Printers
    public void printRooms(){
        System.out.println("");
        for(Room x: rooms){
            System.out.println( x.getRoomNumber() + ": " + x.getAvail().name());
        }
    }
    //Methods
    public Room giveRoom(){
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].getAvail() == Availability.EMPTY){
                rooms[i].setAvail(Availability.OCCUPIED);
                return rooms[i];
            }
        }
        System.out.println("\nThere are no vacant rooms in hotel " + name);
        return null;
    }

    public void takeRoom(Person person, Room room){
        boolean roomFound = false;
        for(int i = 0; i < numOfRooms; i++){
            if(room == rooms[i]){
                person.setKey(null);
                room.setAvail(Availability.EMPTY);
                person.setAssignedRoom(null);
                room.setPerson(null);
                roomFound = true;
                break;
            }

        }
        if (!roomFound){
            System.out.println("\n" + person.getName() + " is trying to check out at the wrong Hotel");
            return;
        }

        System.out.println("\n" + person.getName() + " has checked out of hotel " + name + " at room " + room.getRoomNumber());
    }
}


