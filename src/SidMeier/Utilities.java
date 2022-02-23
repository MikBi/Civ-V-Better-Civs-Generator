package SidMeier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {

    public static List<String> civsList() {

        int listStandard = (int) (Math.random() *(Math.random() * 2137) + 1 );

        List<String> civs = new ArrayList<>();

        civs.add("Waszyngton - Ameryka");
        civs.add("Harun al-Rashid - Arabia");
        civs.add("Ashurbanipal - Asyria");
        civs.add("Maria Teresa - Austria");
        civs.add("Montezuma - Imperium Azteckie");
        civs.add("Pedro II - Brazylia");
        civs.add("Teodora - Bizancjum");
        civs.add("Dydona - Kartagina");
        civs.add("Harald Sinozęby - Dania");
        civs.add("Wilhelm - Holandia");
        civs.add("Elżbieta - Anglia");
        civs.add("Hajle Syllasje - Etiopa");
        civs.add("Napoleon - Francja");
        civs.add("Bismark - Niemcy");
        civs.add("Aleksander - Grecja");
        civs.add("Atylla - Hunowie");
        civs.add("Pachacutec - Imperium Inków");
        civs.add("Gadżad Mada - Indonezja");
        civs.add("Hiawatha - Imperium Irokeskie");
        civs.add("Oda Nobunaga - Japonia");
        civs.add("Pakal - Majowie");
        civs.add("Czyngis-chan - Mongolia");
        civs.add("Ahmad al-Mansur - Maroko");
        civs.add("Sulejman - Imperium osmańskie");
        civs.add("Dariusz I - Persja");
        civs.add("Kamehameha - Polinezja");
        civs.add("Maria I - Portugalia");
        civs.add("Ramkhamhaeng - Syjam");
        civs.add("Askia - Songhai");
        civs.add("Izabela - Hiszpania");
        civs.add("Gustaw Adolf - Szwecja");

        for (int i = 0; i < listStandard; i++) {
            Collections.shuffle(civs);
        }

        return civs;

    }

    public static int ran(int val) {

        int i = 1;

        int listStandard = (int) (Math.random() *(Math.random() * 2137) + 1 );

        for (int y = 0; y < listStandard; y++) {
            i = (int) (Math.random()*val);
        }

        return i;
    }


}
