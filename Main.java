package Hotel;

public class Main {

    public static void main(String[] args){

    Hotel hotel = new Hotel("Proxymorons",3);
    Hotel hotel1 = new Hotel("The chinese",10);
    Person alex = new Person("Alex");
    Person artem = new Person("Artem");
    Person daniel = new Person("Daniel");


    alex.checkIn(hotel);
    daniel.bookRoom(hotel);
    hotel.printRooms();
    }

}
