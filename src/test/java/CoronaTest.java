import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaTest {

    @Test
    public void isMoreThan30(){

        //Given
        int numberOfPeople = 31;

        // When
        String result = Corona.toManyPeople(numberOfPeople);

        //Then
        assertEquals("Zu viele Personen", result);

    }


}
