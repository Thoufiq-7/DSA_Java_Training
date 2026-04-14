package Holiday_Project2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeCommand implements Command {
    @Override
    public void execute(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current System Time: " + now.format(formatter));
    }

    @Override
    public String getDescription() {
        return "Displays the current date and time.";
    }
}
