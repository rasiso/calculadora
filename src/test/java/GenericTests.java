import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTests extends TestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculadoraExist() {
        Calculadora calc = new Calculadora();
        assertNotNull(calc);
    }

    @Test
    public void testCalcIvalidParam(){
        Calculadora calc = new Calculadora();
        System.out.println(calc.add("a,sajl,2;asd,3,1;8,1"));
    }

}
