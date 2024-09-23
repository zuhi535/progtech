package hu.nye;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérlek add meg a neved: ");
        String name = scanner.nextLine();

        System.out.print("Kérlek add meg a nyelvet (hun, eng, haw): ");
        String language = scanner.nextLine().trim();

        if (language.isEmpty()) {
            language = "hun"; // Alapértelmezett nyelv
        }

        String greeting = getGreeting(name, language);
        System.out.println(greeting);
    }

    private static String getGreeting(String name, String language) {
        switch (language.toLowerCase()) {
            case "hun":
                return "Szia, " + name + "!";
            case "eng":
                return "Hello, " + name + "!";
            case "haw":
                return "Aloha, " + name + "!";
            default:
                return "Hiba: Ismeretlen nyelv!";
        }
    }
}