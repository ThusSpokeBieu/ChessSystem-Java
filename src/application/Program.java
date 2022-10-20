package application;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        byte exit = 0;
        int selection = 0;

        while (exit == 0) {
            UI.clearScreen();
            System.out.println();
            System.out.print(UI.ANSI_PURPLE +
                    "   ________                  \n" +
                    "  / ____/ /_  ___  __________\n" +
                    " / /   / __ \\/ _ \\/ ___/ ___/\n" +
                    "/ /___/ / / /  __(__  |__  ) \n" +
                    "\\____/_/ /_/\\___/____/____/\n" + UI.ANSI_YELLOW +
                    "\t   _____            __               \n" +
                    "\t  / ___/__  _______/ /____  ____ ___ \n" +
                    "\t  \\__ \\/ / / / ___/ __/ _ \\/ __ `__ \\\n" +
                    "\t ___/ / /_/ (__  ) /_/  __/ / / / / /\n" +
                    "\t/____/\\__, /____/\\__/\\___/_/ /_/ /_/ \n" +
                    "\t     /____/" + UI.ANSI_RESET);

            System.out.println("\n\n\tWELCOME TO CHESS SYSTEM, choose one from:");
            System.out.println();
            System.out.println("\t1 - New Game");
            System.out.println("\t2 - Quit");

            System.out.print("\n\tYour selected option is: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    exit = 1;
                    Runtime.getRuntime().exec(NewGame.RunGame());
                    break;
                case 2:
                    System.out.println("\tSee ya!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("\tPlease, select a valid option: ");
                    selection = sc.nextInt();
                    break;
            }
        }
    }
}