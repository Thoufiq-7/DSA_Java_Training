package Holiday_Project2;

public class EchoCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Echo needs text to print.");
        } else {
            System.out.println(String.join(" ", args));
        }
    }

    @Override
    public String getDescription() {
        return "Prints the provided text back to the terminal.";
    }
}