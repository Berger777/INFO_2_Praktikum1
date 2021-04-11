public class Chiffre {

    private final String BIGLETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Array Indexes from 0 to 25
    private final String SMALLLETTERS = BIGLETTERS.toLowerCase();

    /**
     * Entschluesselt die Nachricht in allen moeglichen Caesar-Verschiebungen und gibt diese aus
     * @param nachricht - Verschluesselte Nachricht
     */
    public void entschluessleNachricht(String nachricht){
        for (int i=1;i < 26;i++){
            System.out.print(entschluessleNachrichtMitOffset(nachricht, i) + System.lineSeparator());
        }
    }

    /**
     * Entschluesselt den Eingabe String mit der Caesar-Verschluesselung
     * @param nachricht - Zu entschluesselnde Nachricht
     * @param offset - Verschiebungindex
     * @return Entschluesselte Nachricht
     */
    private String entschluessleNachrichtMitOffset(String nachricht, int offset) {
        StringBuilder bob = new StringBuilder();
        for (char c: nachricht.toCharArray()) {
            if(Character.isUpperCase(c)){
                bob.append(BIGLETTERS.charAt((BIGLETTERS.indexOf(c)+offset)%BIGLETTERS.length())); //Array out of Bounds abfangen
            }else if (Character.isLowerCase(c)){
                bob.append(SMALLLETTERS.charAt((SMALLLETTERS.indexOf(c)+offset)%SMALLLETTERS.length()));
            }else {
                bob.append(c);
            }
        }
        return bob.toString();
    }
}
