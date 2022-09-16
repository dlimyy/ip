package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventTest {

    @Test
    public void stringFormatting_unmarkedStringFormatting_success() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Event event = new Event("complete CS2103t ip",
                LocalDate.parse("2025-09-25", dtf));
        Assertions.assertEquals("E # F # complete CS2103t ip # 2025-09-25",
                event.stringFormatting());
    }

    @Test
    public void stringFormatting_markedStringFormatting_success() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Event event = new Event("complete CS2103t ip",
                LocalDate.parse("2025-09-25", dtf));
        event.setCompleted(true);
        Assertions.assertEquals("E # T # complete CS2103t ip # 2025-09-25",
                event.stringFormatting());
    }
}
