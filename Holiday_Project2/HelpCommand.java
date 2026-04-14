package Holiday_Project2;

import java.util.Map;

public class HelpCommand implements Command {
    private final CommandManager manager;

    public HelpCommand(CommandManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute(String[] args) {
        System.out.println("\n--- Available Commands ---");
        for (Map.Entry<String, Command> entry : manager.getCommands().entrySet()) {
            System.out.printf("  %-10s : %s%n", entry.getKey(), entry.getValue().getDescription());
        }
        System.out.println("  exit       : Quits the application.");
        System.out.println("--------------------------\n");
    }

    @Override
    public String getDescription() {
        return "Lists all available commands and their descriptions.";
    }
}
