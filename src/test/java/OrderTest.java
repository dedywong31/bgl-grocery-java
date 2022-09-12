import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testOrderCalculationCheese(){
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("2 packages of 5 items ($20.95 each)");
        assertArrayEquals(expectedOutput.toArray(), Order.orderCalculation("CE",10).toArray());
    }

    @Test
    public void testOrderCalculationHam(){
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("1 package of 8 items ($40.95 each)");
        expectedOutput.add("1 package of 5 items ($29.95 each)");
        expectedOutput.add("1 package of 1 item ($7.95 each)");
        assertArrayEquals(expectedOutput.toArray(), Order.orderCalculation("HM",14).toArray());
    }

    @Test
    public void testOrderCalculationSoySauce(){
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("3 packages of 1 item ($11.95 each)");
        assertArrayEquals(expectedOutput.toArray(), Order.orderCalculation("SS",3).toArray());
    }
}