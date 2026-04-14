package Holiday_Project2;

public class AddCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide at least two numbers. Usage: add <num1> <num2>");
            return;
        }
        try {
            double sum = 0;
            for (String arg : args) {
                sum += Double.parseDouble(arg);
            }
            System.out.println("Result: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be valid numbers.");
        }
    }

    @Override
    public String getDescription() {
        return "Adds a sequence of numbers together.";
    }
}