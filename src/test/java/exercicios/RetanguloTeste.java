package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;
    @BeforeEach
    public void beforeEach() {
        r1 = new Retangulo(10.0, 15.0);
    }
    @AfterEach
    public void afterEach() {
        r1 = null;
    }

    @Test
    public void criarObjRetangulo(){
        assertNotNull(r1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(r1.getAltura());
        assertNotNull(r1.getLado());
    }
    @Test
    public void metodoSetLado(){
        r1.setAltura(15.0);
        r1.setLado(20.0);
        assertEquals(20.0, r1.getLado());
        assertEquals(15.0, r1.getAltura());
    }
    @Test
    public void metodoCalcularArea(){
        assertEquals(150.0, r1.calcularArea());
    }
    @Test void metodoCalcularPerimetro(){
        assertEquals(50.0, r1.calcularPerimetro());
    }
}
