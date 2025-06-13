package tst;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CadastroDeducoesTest{

    private IRPF irpf;

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    Public void testCadastrarPrevidenciaOficial() {
        irpf.cadastrarPrevidenciaOficial(700f);
        assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    Public void testCadastrarPrevidenciaOficial2() {
        irpf.cadastrarPrevidenciaOficial(800f);
        assertEquals(800f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    Public void testCadastrarPrevidenciaOficial3() {
        irpf.cadastrarPrevidenciaOficial(900f);
        assertEquals(900f, irpf.getPrevidenciaOficial(), 0);
    }
}
