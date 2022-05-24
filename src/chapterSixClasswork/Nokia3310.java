package chapterSixClasswork;

import java.util.Scanner;

public class Nokia3310 {


    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String prompt = """
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
                """;
        System.out.println(prompt);
        System.out.println("Choose number:");
        int menu = entry.nextInt();

        switch (menu) {
            case 1:
                prompt = """
                        1 Search
                        2 Service Nos.
                        3 Add name
                        4 Erase
                        5 Edit
                        6 Assign tone
                        7 Send b'card
                        8 Options
                        9 Voice mailbox number
                        10 Service command editor
                        """;
                System.out.println(prompt);
                menu = entry.nextInt();

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
                        prompt = """
                                1 Type of view
                                2 Memory status
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    case 9:
                        System.out.println("Voice mailbox number");
                    case 10:
                        System.out.println("Voice tags");
                }

            case 2:
                prompt = """
                        1 Write messages
                        2 Inbox
                        3 Outbox
                        4 Picture messages
                        5 Templates
                        6 Smileys
                        7 Messages settings
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entry.nextInt();

                switch (menu) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        prompt = """
                                1 Set
                                2 Common
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> {
                                prompt = """
                                        1 Message centre number
                                        2 Messages sent as
                                        3 Message validity
                                        """;
                                System.out.println(prompt);
                                System.out.println("Choose number:");
                                menu = entry.nextInt();
                                switch (menu) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                prompt = """
                                        1 Delivery reports
                                        2 Reply via same centre
                                        3 Character support
                                        """;
                                System.out.println(prompt);
                                System.out.println("Choose number");
                                menu = entry.nextInt();
                                switch (menu) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
                break;

            case 3:
                System.out.println("Chat");
                break;

            case 4:
                prompt = """
                        1 Missed calls
                        2 Received calls
                        3 Dialled numbers
                        4 Erase recent call lists
                        5 Show call duration
                        6 Show call costs
                        7 Call cost setting
                        8 Prepaid credit
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entry.nextInt();
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
                        prompt = """
                                1 Last call duration
                                2 All call's duration
                                3 Received calls' duration
                                4 Dialled calls' duration
                                5 Clear timers
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                        break;

                    case 6:
                        prompt = """
                                1 Last call cost
                                2 All calls' cost
                                3 Clear counters
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls' cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                        break;

                    case 7:
                        prompt = """
                                1 Call cost limit
                                2 Show costs in
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
                break;

            case 5:
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
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entry.nextInt();
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
                }
                break;

            case 6:
                prompt = """
                        1 Call settings
                        2 Phone settings
                        3 Security settings
                        4 Restore factory settings
                        """;
                System.out.println(prompt);
                System.out.println("Choose number:");
                menu = entry.nextInt();
                switch (menu) {
                    case 1 -> {
                        prompt = """
                                1 Automatic redial
                                2 Speed dialling
                                3 Call waiting options
                                4 Own number screening
                                5 Phone line in use
                                6 Automatic answer
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialling");
                            case 3 -> System.out.println("Call waiting services");
                            case 4 -> System.out.println("Own number screening");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
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
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
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
                                """;
                        System.out.println(prompt);
                        System.out.println("Choose number:");
                        menu = entry.nextInt();
                        switch (menu) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                        }
                    }
                    case 4 -> System.out.println("Restore factory settings");
                }
                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calculator");
                break;

            case 10:
                System.out.println("Reminders");
                break;

            case 11:
                prompt = """
                        1 Alarm clock
                        2 chapterTwoAndThree.Clock settings
                        3 Date setting
                        4 Stopwatch
                        5 Countdown timer
                        6 Auto update of date and time
                        """;
                System.out.println(prompt);
                System.out.println("Choose number");
                menu = entry.nextInt();
                switch (menu) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("chapterTwoAndThree.Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
                break;

            case 12:
                System.out.println("Profiles");
                break;

            case 13:
                System.out.println("SIM services");

        }
    }
}
