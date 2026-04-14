package Holiday_Project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CommandManager {
    private final Map<String, Command> commands = new HashMap<>();

    public void registerCommand(String name, Command command) {
        commands.put(name.toLowerCase(), command);
    }

    public Map<String, Command> getCommands() {
        return commands;
    }

    public void executeInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return;
        }

        String[] tokens = input.trim().split("\\s+");
        String commandName = tokens[0].toLowerCase();
        String[] args = Arrays.copyOfRange(tokens, 1, tokens.length);

        Command command = commands.get(commandName);
        if (command != null) {
            command.execute(args);
        } else {
            System.out.println("Error: Unknown command '" + commandName + "'. Type 'help' for available commands.");
        }
    }
}
