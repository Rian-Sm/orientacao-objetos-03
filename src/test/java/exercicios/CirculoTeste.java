package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new  Circulo(5.0);
    }

    @AfterEach
    public void afterEach(){
        c1 = null;
    }

    @Test
    public void criarObjCirculo(){
        assertNotNull(c1);
    }
    @Test
    public void criarObjCirculoMetodoEstatico(){
        Circulo c2 = Circulo.criarCirculo(5.0);
        assertNotNull(c2);
        assertEquals(5.0, c2.getRaio());
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(c1.getRaio());
    }
    @Test
    public void metodoSetRaio(){
        c1.setRaio(30.0);
        assertEquals(30.0, c1.getRaio());
    }
    @Test
    public void metodoSetRaioValorInvalido(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setRaio(-2.0));
        assertEquals("valor invalido para raio", exception.getMessage());
    }
    @Test
    public void metodoCalcularArea(){
        assertEquals(78.539816339744830961566084581988, c1.calcularArea());
    }
    @Test
    public void metodoCalcularPerimetro(){
        assertEquals(31.415926535897932384626433832795, c1.calcularPerimetro());
    }
}
