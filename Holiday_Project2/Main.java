package Holiday_Project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandManager manager = new CommandManager();

        manager.registerCommand("echo", new EchoCommand());
        manager.registerCommand("time", new TimeCommand());
        manager.registerCommand("add", new AddCommand());
        manager.registerCommand("help", new HelpCommand(manager)); 

        Scanner scanner = new Scanner(System.in);
        System.out.println("System initialized. Type 'help' to see commands, or 'exit' to quit.");

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.trim().equalsIgnoreCase("exit")) {
                System.out.println("Shutting down parser. Goodbye!");
                isRunning = false;
                continue;
            }

            manager.executeInput(input);
        }

        scanner.close();
    }
}
