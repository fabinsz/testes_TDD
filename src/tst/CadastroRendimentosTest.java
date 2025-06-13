package tst;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CadastroRendimentosTest{

    private IRPF irpf;

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    Public void testCadastrarSalario() {
        irpf.cadastroSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
 //     fail("Not yet implemented");
    }

    @Test
    public void testCadastrarSalario2() {
        irpf.testCadastrarSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario3() {
        irpf.testCadastrarSalario(5000f);
        irpf.testCadastrarSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);
    }
}
