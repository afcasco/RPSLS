package app.utils;

import java.util.Scanner;

public final class IOUtils {

    public static void showMainMenu() {
        System.out.println("1. PLAY");
        System.out.println("2. VIEW RULES");
        System.out.println("3. LIST SAVE FILES");
        System.out.println("4. VIEW PLAYER HISTORY");
        System.out.println("0. EXIT");
    }

    // input checking to be added
    public static int getInteger() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // input checking to be added
    public static int getInteger(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // input checking to be added
    public static String getString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // input checking to be added
    public static String getString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.next();
    }


}