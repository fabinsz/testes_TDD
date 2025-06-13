package tst;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CadastroDepedentesTest{

    private IRPF irpf;

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    Public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("Joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    Public void testCadastrarDoisDependente() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    Public void testCadastrarTresDependente() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    Public void testCadastrarCincoDependente() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        irpf.cadastrarDependente("Maria Jose");
        irpf.cadastrarDependente("Jose Maria");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }




}