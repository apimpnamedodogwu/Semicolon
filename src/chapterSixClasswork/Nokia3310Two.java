package chapterSixClasswork;

import java.util.Scanner;

public class Nokia3310Two {
    private static int menu;
    private static String prompt;

    private static Scanner entryNokia = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu() {
        prompt = """
                1 for Phonebook
                2 for Message
                3 Chat
                4 for Call Register
                5 for Tones
                6 Settings
                7 Call Divert
                8 Games
                9 Calculator
                10 Reminder
                11 Clock
                12 Profiles
                13 SIM Services
                -1 Exit
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> menuOne();
            case 2 -> menuTwo();
            case 3 -> System.out.println("Chat");
            case 4 -> menuFour();
            case 5 -> menuFive();
            case 6 -> menuSix();
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> menuEleven();
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM services");
        }

    }

    private static void menuOne() {
        prompt = """
                1 Search
                2 Service Nos.
                3 Add name
                4 Erase
                5 Edit
                6 Assign tone
                7 Send b'card
                8 Options
                9 Speed dials
                10 Voice tags
                11 Back
                """;
        System.out.println(prompt);
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                menuOneCaseEight();
                break;

            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            case 11:
                mainMenu();
        }
    }

    private static void menuOneCaseEight() {
        prompt = """
                1 Type of view
                2 Memory status
                3 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Type of view");
            case 2 -> System.out.println("Memory status");
            case 3 -> menuOne();
        }
    }

    private static void menuTwo() {
        prompt = """
                1 Write messages
                2 Inbox
                3 Outbox
                4 Picture messages
                5 Templates
                6 Smileys
                7 Messages settings
                8 Info service
                9 Voice mailbox number
                10 Service command editor
                11 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Write messages");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> {
                menuTwoCaseSeven();
            }
            case 8 -> System.out.println("Info services");
            case 9 -> System.out.println("Voice mailbox number");
            case 10 -> System.out.println("Service command editor");
            case 11 -> mainMenu();
        }

    }

    private static void menuTwoCaseSeven() {
        prompt = """
                1 Set
                2 Common
                3 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> {
                prompt = """
                        1 Message centre number
                        2 Messages sent as
                        3 Message validity
                        4 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Message centre number");
                    case 2 -> System.out.println("Messages sent as");
                    case 3 -> System.out.println("Message validity");
                    case 4 -> menuTwoCaseSeven();
                }
            }
            case 2 -> {
                prompt = """
                        1 Delivery reports
                        2 Reply via same centre
                        3 Character support
                        4 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Delivery reports");
                        break;
                    case 2:
                        System.out.println("Reply via same centre");
                    case 3:
                        System.out.println("Character support");
                        break;
                    case 4:
                        menuTwoCaseSeven();
                }
            }
            case 3 -> menuTwo();
        }
    }

    public static void menuFour() {
        prompt = """
                1 Missed calls
                2 Received calls
                3 Dialled numbers
                4 Erase recent call lists
                5 Show call duration
                6 Show call costs
                7 Call cost setting
                8 Prepaid credit
                9 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call list");
                break;
            case 5:
                menuFourCaseFive();
                break;

            case 6:
                prompt = """
                        1 Last call cost
                        2 All calls' cost
                        3 Clear counters
                        4 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Last call cost");
                    case 2 -> System.out.println("All calls' cost");
                    case 3 -> System.out.println("Clear counters");
                    case 4 -> menuFour();
                }
                break;

            case 7:
                prompt = """
                        1 Call cost limit
                        2 Show costs in
                        3 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Call cost limit");
                    case 2 -> System.out.println("Show costs in");
                    case 3 -> menuFour();
                }
            case 8:
                System.out.println("Prepaid credit");
                break;
            case 9:
                mainMenu();
        }

    }

    private static void menuFourCaseFive() {
        prompt = """
                1 Last call duration
                2 All call's duration
                3 Received calls' duration
                4 Dialled calls' duration
                5 Clear timers
                6 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All calls' duration");
            case 3 -> System.out.println("Received calls' duration");
            case 4 -> System.out.println("Dialled calls' duration");
            case 5 -> System.out.println("Clear timers");
            case 6 -> menuFour();
        }
    }

    private static void menuFive() {
        prompt = """
                1 Ringing tone
                2 Ringing volume
                3 Incoming call alert
                4 Composer
                5 Message alert tone
                6 Keypad tones
                7 Warning and game tones
                8 Vibrating alert
                9 Screen saver
                10 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Ringing tone");
            case 2 -> System.out.println("Ringing volume");
            case 3 -> System.out.println("Incoming call alert");
            case 4 -> System.out.println("Composer");
            case 5 -> System.out.println("Message alert tone");
            case 6 -> System.out.println("Keypad tones");
            case 7 -> System.out.println("Warning and game tones");
            case 8 -> System.out.println("Vibrating alert");
            case 9 -> System.out.println("Screen saver");
            case 10 -> mainMenu();
        }
    }

    private static void menuSix() {
        prompt = """
                1 Call settings
                2 Phone settings
                3 Security settings
                4 Restore factory settings
                5 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> {
                prompt = """
                        1 Automatic redial
                        2 Speed dialling
                        3 Call waiting options
                        4 Own number screening
                        5 Phone line in use
                        6 Automatic answer
                        7 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Automatic redial");
                    case 2 -> System.out.println("Speed dialling");
                    case 3 -> System.out.println("Call waiting services");
                    case 4 -> System.out.println("Own number screening");
                    case 5 -> System.out.println("Phone line in use");
                    case 6 -> System.out.println("Automatic answer");
                    case 7 -> menuSix();

                }
            }
            case 2 -> {
                prompt = """
                        1 Language
                        2 Cell info display
                        3 Welcome note
                        4 Network selection
                        5 Lights
                        6 Confirm SIM service actions
                        7 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell info display");
                    case 3 -> System.out.println("Welcome note");
                    case 4 -> System.out.println("Network selection");
                    case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM service actions");
                    case 7 -> menuSix();
                }
            }
            case 3 -> {
                prompt = """
                        1 PIN code request
                        2 Call barring service
                        3 Fixed dialling
                        4 Closed user group
                        5 Phone security
                        6 Change access codes
                        7 Back
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entryNokia.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("PIN code request");
                    case 2 -> System.out.println("Call barring service");
                    case 3 -> System.out.println("Fixed dialling");
                    case 4 -> System.out.println("Closed user group");
                    case 5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");
                    case 7 -> menuSix();
                }
            }
            case 4 -> System.out.println("Restore factory settings");
            case 5 -> mainMenu();
        }
    }

    private static void menuEleven() {
        prompt = """
                1 Alarm clock
                2 chapterTwoAndThree.Clock settings
                3 Date setting
                4 Stopwatch
                5 Countdown timer
                6 Auto update of date and time
                7 Back
                """;
        System.out.println(prompt);
        System.out.println("Choose number");
        menu = entryNokia.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("chapterTwoAndThree.Clock settings");
            case 3 -> System.out.println("Date setting");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date and time");
            case 7 -> mainMenu();
        }
    }

}
