package SidMeier.Functionalities;


import java.util.*;
import java.util.concurrent.TimeUnit;
import static SidMeier.Menu.main;
import static SidMeier.Utilities.*;

public class Civilization_Choose_Generator {

    public static void select() {

        System.out.println("----------------------------");
        System.out.println("Wpisz ilość graczy do wylosowania: ");
        System.out.println("----------------------------");
        int i = amountOfPlayerParser();
        generate(false,i);

    }

    private static int amountOfPlayerParser() {

        int i = 1;

        try {
            Scanner scanner = new Scanner(System.in);
            i = Integer.parseInt(scanner.nextLine());
        } catch (Exception ex) {

            System.out.println("Podana wartość nie jest liczbą. Proszę wpisać liczbę: ");

            amountOfPlayerParser();

        }

        return i;

    }

    public static void select(boolean isShort) {

        if (isShort) {
            generate(true,0);
        } else {
            select();
        }

    }

    private static void generate(boolean isShort , int amount) {

        List<String> s = civsList();

        if(isShort) {

            String raf = s.get(ran(31));
            String mik = s.get(ran(31));

            int level = 1;

            while(raf.equals(mik)) {

                raf = s.get(ran(31));
                mik = s.get(ran(31));

                System.out.println();
                System.out.println("----------------------------");
                System.out.println("POZIOM POWTÓRZENIA ==> " + level);
                System.out.println("----------------------------");

                level++;
            }

            System.out.println();
            System.out.println("Rafał -> " + raf);
            System.out.println("----------------------------");
            System.out.println("Mikołaj -> " + mik);

        } else {

            Map<String,String> mapOfPlayers = new HashMap<>();

            Set<String> setOfCivs = new HashSet<>();

            while (setOfCivs.size() != amount) {

                setOfCivs.add(s.get(ran(31)));

            }

            List<String> listOfCivs = new ArrayList<>(setOfCivs);

            for (int i = 1; i <= amount ; i++) {

                mapOfPlayers.put("Player " + i,listOfCivs.get(i - 1));

            }

            System.out.println("----------------------------");
            System.out.println();
            mapOfPlayers.forEach((k, v) -> System.out.println((k + " : " + v)));
            System.out.println();
            System.out.println("----------------------------");

        }

        try {

            TimeUnit.SECONDS.sleep(5);
            System.out.println();
            System.out.println("POWRÓT DO MENU");
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            System.out.print(". ");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(". ");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(". ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println();

        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd. Powrót do menu");
        } finally {
            main(new String[0]);
        }

    }




}
