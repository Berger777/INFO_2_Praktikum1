public class Primzahlen {

    /**
     * Ueberprueft ob die Integer Zahl eine Primzahl ist
     * @param n - zu testende Zahl
     * @return true wenn Primzahl, sonst false
     */
    public boolean isPrime(int n){
        for (int i = 2;i*i < n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Gibt alle Primzahlen bis n aus
     * @param n
     */
    public void gebePrimzahlenAusgebenBis(int n){
        for (int i = 2; i < n;i++){
            if (isPrime(i)){
                System.out.print(i+" ist eine Primzahl!"+ System.lineSeparator());
            }
        }
    }
}
