import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PackagingOptionTest {

    Object[] expectedPackOps = new Object[5];

    @BeforeEach
    public void initInputs(){
        expectedPackOps[0] = new PackagingOption("CE",3,14.95d);
        expectedPackOps[1] = new PackagingOption("CE",5,20.95d);
        expectedPackOps[2] = new PackagingOption("HM",2,13.95d);
        expectedPackOps[3] = new PackagingOption("HM",5,29.95d);
        expectedPackOps[4] = new PackagingOption("HM",8,40.95d);
    }

    @Test
    public void testcomparePackOps(){
        /**
         * convert List of objects to array of objects
         */
        Object[] testOutput = PackagingOption.getPackOpsList().toArray();
        assertArrayEquals(expectedPackOps,testOutput);
    }
}
