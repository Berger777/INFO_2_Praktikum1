import java.util.Date;

public class Uhr {

    /**
     * Gibt die aktuelle Zeit aus
     */
    public void gebeAktuellZeitAus(){
        Date date = new Date();
        System.out.println("Jetzt: "+ date.toString());
    }
}
