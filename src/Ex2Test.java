import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Ex2Test {
    @Test
    public void test0(){
        List <String> names = Arrays.asList("MMEXE", "MNCS", "NSWSW", "SWEXE", "EXESSF");
        List <String> expectedNames = Arrays.asList("MMEXE","SWEXE", "EXESSF");
        assertEquals(expectedNames, Ex2.filterNames(names));
    }

    @Test
    public void test1(){
        List <String> names = Arrays.asList("MMEXe", "MNCS", "NSWSW", "SWeXE", "EXESSF");
        List <String> expectedNames = Arrays.asList("EXESSF");
        assertEquals(expectedNames, Ex2.filterNames(names));
    }

    @Test
    public void test2(){
        List <String> names = Arrays.asList("MMEXe", "MNCS", "NSWSW", "SWeXE", "eXESSF");
        List <String> expectedNames = Arrays.asList();
        assertEquals(expectedNames, Ex2.filterNames(names));
    }
    
}
