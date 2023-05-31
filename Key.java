package Hotel;

public class Key {
    //Properties
    private String password;

    //Constructor
    public Key(String password){
        this.password = password;
    }

    //Printers
    @Override
    public String toString(){
        return ("Key password: " + password );
    }



}
