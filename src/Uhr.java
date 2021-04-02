import java.util.Date;

public class Uhr {
    public void gebeAktuellZeitAus(){
        Date date = new Date();
        System.out.println("Jetzt: "+ date.toString());
    }
}
