public class WuerfelSpiel {
    static int sechser = 0; //speichert die Anzahl der Sechser

    // statische Methode wuerfeln() mit Parameter einfuegen
    public static void wuerfeln(int anzahlWuerfe) {
        //Array erzeugen
        int[] wuerfe = new int[anzahlWuerfe];

        //Array befüllen: Zufallszahlen erzeugen mit Math.random(), Achtung: Gibt Werte zwischen 0 und 0.99999(...)9 zurück, muss daher mit der maximalen Wurfzahl multipliziert werden
        for (int i = 0; i < wuerfe.length; i++) {
            // Hinweis: muss in (int) umgewandelt werden, da wir ganze Zahlen brauchen, Kommazahlen werden einfach abgetrennt, 0 muss ausgeschlossen werden
            int wurf = (int) ((Math.random()) * 6 + 1);
            wuerfe[i] = wurf;
        }

        //Lesen des Arrays, Ausgabe der Elemente, zählen und ausgeben der Sechser
        for (int wurf : wuerfe) {
            if (wurf == 6) {
                sechser++;
            }
            System.out.println(wurf);
        }

        System.out.println("Sechser: " + sechser);
    }

    public static void main(String[] args) {
        //Aufruf der Methode wuerfeln() mit 10 Würfen
        WuerfelSpiel.wuerfeln(10);
    }
}