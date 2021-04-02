public class Primzahlen {

    public boolean isPrime(int n){
        for (int i = 2;i*i < n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void gebePrimzahlenAusgebenBis(int n){
        for (int i = 2; i < n;i++){
            if (isPrime(i)){
                System.out.print(i+" ist eine Primzahl!"+ System.lineSeparator());
            }
        }
    }
}
