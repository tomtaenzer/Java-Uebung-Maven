import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void dupicateValue(){

        // given

        int var = 2;

        // then

        int var1 = Dupicate.duplicate(var);

        // then
        assertEquals(4,var1);
    }


}
