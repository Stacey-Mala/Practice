package practice4.swichSolver;

import java.util.Scanner;

public class ControlPanel {
    public enum Command {
        START("System started successfully."),
        STOP("System stopped."),
        RESTART("System is restarting..."),
        STATUS("System is running.");

        public final String message;

        Command(String message){
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }

        public static Command fromInput(String input){
            String edited = input.toLowerCase();
            return switch(edited) {
                case "start" -> START;
                case "stop" -> STOP;
                case "restart" -> RESTART;
                case "status" -> STATUS;
                default -> throw new IllegalArgumentException ("Unknown command: " + input);
            };
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- Control Panel ---");
            System.out.println("Available commands: start, stop, restart, status, exit");
            while(true) {
                System.out.print("Enter a command: ");
                String input = scanner.nextLine().trim();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Exiting...");
                    break;
                }
                try {
                    Command command = Command.fromInput(input);
                    System.out.println(command.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
