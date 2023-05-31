package Hotel;

public enum Availability {
    EMPTY("empty"),
    OCCUPIED("occupied"),
    BOOKED("booked");

    private String name;

    Availability(String name){
        this.name = name;
    }

}
