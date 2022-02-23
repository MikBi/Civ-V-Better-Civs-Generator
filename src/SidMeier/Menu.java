package SidMeier;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static SidMeier.Functionalities.Achievement_Generator.AchievementsAndCivilizations;
import static SidMeier.Functionalities.Civilization_Choose_Generator.select;

public class Menu {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("WITAJ W LEPSZYM SYSTEMIE WYBORU OPCJI DLA SID MEIER'A CIVILIZATION V. WPISZ INTERESUJĄCĄ CIĘ FUNKCJONALNOŚĆ Z LISTY PONIŻEJ PODAJĄC ODPOWIEDNI JEGO NUMER: ");
        System.out.println();
        System.out.println("Generowanie losowej cywilizacji ==> 1");
        System.out.println();
        System.out.println("Zakończenie programu ==> 0");
        System.out.println();
        System.out.println("----------------------------");
        menu();
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        switch (result) {
            case "0" -> {
                System.out.println();
                System.out.println("Dziękuje za skorzystanie z programu!");
                System.out.println();
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("U");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("w");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("U");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                } catch (Exception ignored) {

                }
            }
            case "1" -> select();
            case "1.1" -> select(true);
            case "#toBeContinue#" -> AchievementsAndCivilizations();
            default -> {
                System.out.println("----------------------------");
                System.out.println("Wpisana wartość jest nieprawidłowa. Spróbuj jeszcze raz!");
                System.out.println("----------------------------");
                menu();
            }


        }
    }


}

