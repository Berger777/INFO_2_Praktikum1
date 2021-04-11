public class Main {

    public static void main(String args[]){
        //aufgabe1();
        //aufgabe3();
        aufgabe4();
    }

    public static void aufgabe1(){
        Uhr uhr = new Uhr();
        uhr.gebeAktuellZeitAus();
    }

    public static void aufgabe3(){
        Primzahlen primzahlen = new Primzahlen();
        primzahlen.gebePrimzahlenAusgebenBis(100000);
    }

    public static void aufgabe4(){
        Chiffre chiffre = new Chiffre();
        chiffre.entschluessleNachricht("Ebowifzebk Dirbzhtrkpze! Pfb exybk afb Sbopzeirbppbirkd dbhkxzhq rka ybhljjbk yxia bfk Gly-Xkdbylq slj xjbofhxkfpzebk Dbebfjafbkpq.");
    }
}
