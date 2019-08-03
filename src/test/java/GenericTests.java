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
    public void testCalcInvalidParam(){
        Calculadora calc = new Calculadora();
        assertEquals(4,calc.add("a,sajl,2;asd,3,1;8,1"));
    }

    /*@Test
    public void testCalcMax2numbers(){
        Calculadora calc = new Calculadora();
        assertEquals(3,calc.add("1,2,3"));
    }*/

    @Test
    public void testCalcAcceptNewLine(){
        Calculadora calc = new Calculadora();
        assertEquals(6,calc.add("1\n2,3"));
    }

    @Test
    public void testCalcNewDelimiter(){
        Calculadora calc = new Calculadora();
        assertEquals(3,calc.add("//;\n1;2"));
        assertEquals(3,calc.add("//\n1;2"));
        assertEquals(2,calc.add("\n//1,2"));
    }

    @Test
    public void testCalcnegativeNumbers(){
        Calculadora calc = new Calculadora();
        assertEquals(4,calc.add("-1,-2,4"));
    }
}
