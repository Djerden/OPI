package tools;
import org.junit.jupiter.api.Test;
import tools.TimeConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    @Test
    void testGetAsObject() {
        TimeConverter converter = new TimeConverter();
        String dateTimeString = "2022-12-31T23:59:59+00:00";
        LocalDateTime expectedDateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        assertEquals(expectedDateTime, converter.getAsObject(null, null, dateTimeString));
    }

    @Test
    void testGetAsString() {
        TimeConverter converter = new TimeConverter();
        LocalDateTime dateTime = LocalDateTime.of(2022, 12, 31, 23, 59, 59);
        String expectedDateTimeString = "31.12.2022 23:59:59";
        assertEquals(expectedDateTimeString, converter.getAsString(null, null, dateTime));
    }
}