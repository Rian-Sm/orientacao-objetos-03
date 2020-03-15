package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    private Correntista c1;
    @BeforeEach
    public void beforeEach(){
        c1 = new Correntista("Nome Da Pessoa", "contatopessoa@email.com", 25, 1050.0 );
    }
    @AfterEach
    public void afterEach(){
        c1= null;
    }
    @Test
    public void criarObjCorrentista(){
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(c1.getEmail());
        assertNotNull(c1.getIdade());
        assertNotNull(c1.getNome());
        assertNotNull(c1.getSalario());
    }
    @Test
    public void metodoObterDados(){
        assertEquals("Nome Da Pessoa, 25 anos (contatopessoa@email.com)", c1.obterDados());
    }
    @Test
    public void metodoPromover(){
        c1.promover(10.0);
        assertEquals(1155.0, c1.getSalario());
    }
    @Test
    public void criarobjCorrentistaMetodoEstatico(){
        Correntista pessoa = Correntista.criarCorrentista("pessoa da silva", "contatopessoa", 100, 3000.0);
        assertNotNull(pessoa);
    }
    @Test
    public void criarObjCorrentistaIdadeSaldoIvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->Correntista.criarCorrentista("Nome Qualquer", "emailcontato", -60, 1000.0));
        assertEquals("valor ivalido", exception.getMessage());
        Exception exception1 = assertThrows(IllegalArgumentException.class, () ->Correntista.criarCorrentista("Nome Qualquer", "emailcontato", 60, -1000.0));
    }
    @Test
    public void metodoPromoverValorIvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.promover(-10.0));
        assertEquals("valor ivalido", exception.getMessage());
    }
}
