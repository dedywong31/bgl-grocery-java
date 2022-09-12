import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Object[] expectedProducts = new Object[3];

    @BeforeEach
    public void initInputs(){
        expectedProducts[0] = new Product("CE","Cheese",5.95d);
        expectedProducts[1] = new Product("HM","Ham",7.95d);
        expectedProducts[2] = new Product("SS","Soy Sauce",11.95d);
    }

    @Test
    public void testcompareProducts() {
        /**
         * convert List of objects to array of objects
         */
        Object[] testOutput = Product.getProductList().toArray();
        assertArrayEquals(expectedProducts, testOutput);
    }
}